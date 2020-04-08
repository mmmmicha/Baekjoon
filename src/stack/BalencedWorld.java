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
 * */

public class BalencedWorld
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = null;
		
		do
		{
			sb = new StringBuilder(br.readLine());
			Stack<String> st = new Stack<String>();
			
			int i=0;
			
			for(i=0; i<sb.length(); i++)
			{
				if(sb.toString().substring(i, i+1).equals("("))
				{
					st.push("(");
				}
				else if(sb.toString().substring(i, i+1).equals(")"))
				{
					if(st.isEmpty())
					{
						System.out.println("NO");
						break;
					}
					else if(st.peek().equals("("))
					{
						st.pop();
					}
					else
					{
						System.out.println("NO");
						break;
					}
				}
				if(sb.toString().substring(i, i+1).equals("["))
				{
					st.push("[");
				}
				else if(sb.toString().substring(i, i+1).equals("]"))
				{
					if(st.isEmpty())
					{
						System.out.println("NO");
						break;
					}
					else if(st.peek().equals("["))
					{
						st.pop();
					}
					else
					{
						System.out.println("NO");
						break;
					}
				}
			}
			
			if(!sb.toString().startsWith(".") && sb.toString().substring(i-1, i).equals("."))
			{
				if(st.isEmpty())
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			
			
		} while (!sb.toString().startsWith("."));
	}
}
