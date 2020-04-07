package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 테스트번호 : 2805번
 * 테스트명 : 나무자르기
 * @Kwanghyeon
 * 
 * 2020-04-07 long 의 함정
 * 
 * */

public class Cuttingtree
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		
		int[] info = new int[temp.length];
		
		for(int i=0; i<temp.length; i++)
			info[i] = Integer.parseInt(temp[i]);
		
		String[] compo = br.readLine().split(" ");
		
		long[] compoinfo = new long[compo.length];
		
		for(int i=0; i<compo.length; i++)
			compoinfo[i] = Long.parseLong(compo[i]);
		
		Arrays.sort(compoinfo);
		
		long min = 0;
		long max = compoinfo[compoinfo.length-1];
		long mid = 0;
		long ans = 0;
		
		while(min <= max)
		{
			mid = (max+min)/2;
			
			for(long c : compoinfo)
			{
				if(c>mid)
					ans+=c-mid;
			}
			
			if(ans>=info[1])
				min = mid+1;
			else
				max = mid-1;
			
			ans = 0;
			
		}
		
		System.out.println(max);
	}
}
