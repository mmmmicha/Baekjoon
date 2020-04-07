package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * 테스트번호 : 1920번
 * 테스트명 : 수 찾기
 * @Kwanghyeon
 * 
 * 2020-04-07 이진탐색으로 해결하는 방법 고민
 * hash로 해결
 * 
 * */

public class SearchNumber
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] temp = br.readLine().split(" ");
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		for(String a : temp)
			hash.put(a, 0);
		
		int m = Integer.parseInt(br.readLine());
		
		String[] ans = br.readLine().split(" ");
		
		StringBuilder ansb = new StringBuilder();
		
		for(int i=0; i<ans.length; i++)
		{
			if(hash.containsKey(ans[i]))
			{
				ansb.append("1\n");
			}
			else
				ansb.append("0\n");
		}
		
		System.out.println(ansb.toString());
		
	}
}
