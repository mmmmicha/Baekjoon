package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 테스트번호 : 12015번
 * 테스트명 : 가장 긴 증가하는 수열2
 * @Kwanghyeon
 * 
 * 2020-04-08 쉽지않음 기준을 뭘로잡아야할지...
 * 2020-04-10 갈피는 잡음. 기준잡기 계속
 * 2020-04-12 max, min 그리고 if 조건문 등 부등호를 정확히 잡기가 어려움(해결)
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
		
		int max;
		int min;
		int mid;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-5555);
		
		for(int i=0; i<n; i++)
		{
			inp[i] = Integer.parseInt(temparr[i]);
			//System.out.println("ans : " + inp[i]);
			
			if(arr.get(arr.size()-1)<inp[i])
			{
				arr.add(inp[i]);
			}
			else
			{
				max = arr.size()-1;
				min = 0;
				
				while(min<max)
				{
					mid = (max+min)/2;
					
					if(inp[i]>arr.get(mid))
						min = mid+1;
					else
						max = mid;
				}
				
				//System.out.println("max : " + max + ", min : " + min + ", mid : " + mid);
				//System.out.println("get(max) : " + arr.get(max) + ", inp : " + inp[i]);
				
				arr.set(max, inp[i]);
			}
		}
		
		System.out.println(arr.size()-1);
		
	}
}
