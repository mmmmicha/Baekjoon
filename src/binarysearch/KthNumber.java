package binarysearch;

import java.util.Scanner;

/*
 * 테스트번호 : 1300번
 * 테스트명 : K번째 수
 * @Kwanghyeon
 * 
 * 2020-04-08 좀 더 고민해보기 (미완성)
 * 
 * 2020-04-12 mid 를 k번째수에 해당하는 숫자로 기준하고 문제를 풀기(해결)
 * 
 * */

public class KthNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int min = 1, max = k, mid = 0, answer = 0, temp = 0;
		
		while(min<=max)
		{
			mid = (max+min)/2;
			
			temp=0;
			
			for(int i=1; i<=n; i++)
			{
				temp += Math.min(mid/i, n);
			}
			
			if(temp>=k)
			{
				answer = mid;
				max = mid-1;
			}
			else
			{
				min = mid+1;
			}
			
		}
		
		System.out.println(answer);
		
	}
}
