package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 테스트번호 : 1654번
 * 테스트명 : 랜선자르기
 * @Kwanghyeon
 * 
 * 2020-04-07 문제점 찾아야함.
 * 2020-04-07 꼭 input 범위 잘봐서 long 이 될수있는지 여부 꼭 고려할것!!
 * 
 * */
public class Cuttingwire
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inp = br.readLine().split(" ");
		
		int[] arri = new int[2];
		
		for(int i=0; i<arri.length; i++)
		{
			arri[i] = Integer.parseInt(inp[i]);
		}
		
		int[] comp = new int[arri[0]];
		
		for(int i=0; i<arri[0]; i++)
		{
			comp[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(comp);
		
		long min = 1;
		long max = comp[comp.length-1];
		//int max = 457;
		long mid = 0;
		int ans = 0;
		
		while(min<=max)
		{
			mid = (min+max)/2;
			
			for(int i=0; i<comp.length; i++)
			{
				ans += comp[i]/mid;
			}
			
			if(ans>=arri[1])
			{
				min = mid+1;
			}
			else
			{
				max = mid-1;
			}
			//System.out.println("min : " + min +", max : "+ max + ", mid : " + mid);
			ans = 0;
		}
		
		System.out.println(max);
		
	}
}
