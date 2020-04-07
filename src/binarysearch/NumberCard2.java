package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * 테스트번호 : 10816번
 * 테스트명 : 숫자카드2
 * @Kwanghyeon
 * 
 * 2020-04-07 hash 이용 정답
 * 
 * */

public class NumberCard2
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		String[] arrn = br.readLine().split(" ");
		
		for(int i=0; i<arrn.length; i++)
		{
			hash.put(arrn[i], hash.getOrDefault(arrn[i], 0)+1);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		String[] ans = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<ans.length; i++)
		{
			if(hash.containsKey(ans[i]))
				sb.append(hash.get(ans[i])+" ");
			else
				sb.append("0 ");
		}
		
		System.out.println(sb.toString());
			
		
		
	}
}
