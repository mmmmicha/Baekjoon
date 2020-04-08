package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 테스트번호 : 12015번
 * 테스트명 : 가장 긴 증가하는 수열2
 * @Kwanghyeon
 * 
 * 2020-04-08 쉽지않음 기준을 뭘로잡아야할지...
 * 
 * */

public class TheLongest
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] temparr = br.readLine().split(" ");
		
		int[] inp = new int[temparr.length];
		
		int max = 0;
		int min = 123456789;
		int mid = 0;
		
		for(int i=0; i<inp.length; i++)
		{
			inp[i] = Integer.parseInt(temparr[i]);
			max = Math.max(inp[i], max);
			min = Math.min(inp[i], min);
		}
		
		int ansmax = 0;
		
		while(min<=max)
		{
			mid = (max+min)/2;
			int temp = inp[0]+mid;
			int ans = 1;
			
			for(int t : inp)
			{
				if(t>=temp && t!=inp[0])
				{
					temp=t+mid;
					ans++;
				}
					
			}
			
			//System.out.println("max : " + max + ", min : " + min + ", mid : " + mid + ", ans : " + ans + ", ansmax : " + ansmax);
			
			if(ansmax<=ans)
			{
				max = mid-1;
				ansmax = ans;
			}
			else	
				min = mid+1;
			
		}
		
		System.out.println(ansmax);
		
		
		
	}
}
