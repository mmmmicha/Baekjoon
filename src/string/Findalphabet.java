package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 테스트번호 : 10809번
 * 테스트명 : 알파벳찾기
 * @Kwanghyeon
 * 
 * */

public class Findalphabet
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int[] ans = new int[26];
		boolean[] check = new boolean[26];
		
		Arrays.fill(ans, -1);
		
		for(int i=0; i<word.length(); i++)
		{
			int temp = (int)word.charAt(i);
			
			if(!check[temp-97])
			{
				ans[temp-97] = i;
				check[temp-97] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int t : ans)
			sb.append(t + " ");
		
		System.out.println(sb.toString());
		
	}
}
