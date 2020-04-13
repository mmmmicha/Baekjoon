package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 테스트번호 : 4949번
 * 테스트명 : 균형잡힌 세상
 * @Kwanghyeon
 * 
 * 2020-04-08 런타임에러
 * 
 * 2020-04-13 String 과 StringBuilder 와의 메모리 사용에 대해 확실히 이해할 필요가 있음.(해결)
 * 
 * */

public class BalencedWorld
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringBuilder sb = new StringBuilder();
		Stack<String> st = new Stack<String>();
		String sb = null;
		
		do
		{
			//sb.delete(0, sb.length());
			//sb.append(br.readLine());
			sb = br.readLine();
			st.clear();
			
			int i=0;
			
			for(i=0; i<sb.length(); i++)
			{
				if(sb.substring(i, i+1).equals("("))
				{
					st.push("(");
				}
				else if(sb.substring(i, i+1).equals(")"))
				{
					if(st.isEmpty())
					{
						System.out.println("no");
						break;
					}
					else if(st.peek().equals("("))
					{
						st.pop();
					}
					else
					{
						System.out.println("no");
						break;
					}
				}
				if(sb.substring(i, i+1).equals("["))
				{
					st.push("[");
				}
				else if(sb.substring(i, i+1).equals("]"))
				{
					if(st.isEmpty())
					{
						System.out.println("no");
						break;
					}
					else if(st.peek().equals("["))
					{
						st.pop();
					}
					else
					{
						System.out.println("no");
						break;
					}
				}
				else if(!sb.startsWith(".") && sb.substring(i, i+1).equals("."))
				{
					if(st.isEmpty())
						System.out.println("yes");
					else
						System.out.println("no");
					break;
				}
			}
			
			
		} while (!sb.startsWith("."));
	}
}
