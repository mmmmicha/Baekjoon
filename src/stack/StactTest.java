package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 테스트번호 : 10828번
 * 테스트명 : 스택
 * @Kwanghyeon
 * 
 * */

public class StactTest
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++)
		{
			sb.append(br.readLine());
			
			if(sb.toString().startsWith("push"))
			{
				st.push(Integer.parseInt(sb.toString().split(" ")[1]));
				sb.delete(0, sb.length());
			}
			else if(sb.toString().startsWith("top"))
			{
				if(!st.isEmpty())
					System.out.println(st.peek());
				else
					System.out.println(-1);
				sb.delete(0, sb.length());
			}
			else if(sb.toString().startsWith("size"))
			{
				System.out.println(st.size());
				sb.delete(0, sb.length());
			}
			else if(sb.toString().startsWith("empty"))
			{
				if(st.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				sb.delete(0, sb.length());
			}
			else
			{
				if(!st.isEmpty())
					System.out.println(st.pop());
				else
					System.out.println(-1);
				sb.delete(0, sb.length());
			}
		}
	}
}
