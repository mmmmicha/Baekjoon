package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 테스트번호 : 9012번
 * 테스트명 : 괄호
 * @Kwanghyeon
 * 
 * */

public class BasicBracket
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<String> st = new Stack<String>();
		
		
		for(int i=0; i<k; i++)
		{
			StringBuilder sb = new StringBuilder(br.readLine());
			int count = 0;
			
			for(int j=0; j<sb.length(); j++)
			{
				if(sb.toString().substring(j, j+1).equals("("))
					st.push("(");
				else
				{
					if(st.isEmpty())
					{
						count--;
					}
					else
						st.pop();
				}
					
			}
			
			if(st.size()==0 && count==0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			st.removeAll(st);
			
		}
		
	}
}	
