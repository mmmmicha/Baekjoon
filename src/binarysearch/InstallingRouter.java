package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 테스트번호 : 2110번
 * 테스트명 : 공유기설치
 * @Kwanghyeon
 * 
 * 2020-04-08 max, min 설정오류 해결
 * 
 * */

public class InstallingRouter
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		
		int[] inp = new int[temp.length];
		
		for(int i=0; i<temp.length; i++)
		{
			inp[i] = Integer.parseInt(temp[i]);
		}
		
		long[] compo = new long[inp[0]];
		
		for(int i=0; i<inp[0]; i++)
		{
			compo[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(compo);
		
		// 차이를 기준으로 한다는것을 명확히 알아야함!!
		// 틀렸던 이유 : min 을 compo[0], max 를 compo[compo.length-1] 로 함.
		long max = compo[compo.length-1]-compo[0];
		long min = 1;
		long mid = 0;
		
		while(min<=max)
		{
			long t = 0;
			mid = (max+min)/2;
			int ans = 0;
			
			for(long c : compo)
			{
				if(c==compo[0])
				{
					t = c+mid;
					ans = 1;
				}
				else
				{
					if(c>=t)
					{
						ans++;
						t = c+mid;
					}
					
				}
			}
			
			//System.out.println("max : " + max + ", min : " + min + ", mid : " + mid + ", ans : " + ans);
			
			if(ans>=inp[1])
				min = mid+1;
			else
				max = mid-1;
			
		}
		
		System.out.println(max);
		
	}
}
