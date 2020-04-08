package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 테스트번호 : 10773번
 * 테스트명 : 제로
 * @Kwanghyeon
 * 
 * */

public class Zero
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> st = new Stack<Integer>();
		
		int temp = 0;
		
		for(int i=0; i<k; i++)
		{
			temp = Integer.parseInt(br.readLine());
			if(temp==0)
			{
				st.pop();
			}
			else
				st.push(temp);
		}
		
		int answer = 0;
		
		while(!st.isEmpty())
			answer += st.pop();
		
		System.out.println(answer);
	}
}
