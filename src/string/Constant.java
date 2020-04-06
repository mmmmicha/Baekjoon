package string;

import java.util.Scanner;

/*
 * 테스트번호 : 2908번
 * 테스트명 : 상수
 * @Kwanghyeon
 * 
 * */

public class Constant
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] s1 = sc.next().split("");
		String[] s2 = sc.next().split("");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s1.length/2; i++)
		{
			sb.append(s1[i]);
			s1[i] = s1[s1.length-1-i];
			s1[s1.length-1-i] = sb.toString();
			sb.delete(0, 1);
		}
		
		for(int i=0; i<s2.length/2; i++)
		{
			sb.append(s2[i]);
			s2[i] = s2[s2.length-1-i];
			s2[s2.length-1-i] = sb.toString();
			sb.delete(0, 1);
		}
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(String temp : s1)
			sb1.append(temp);
		
		for(String temp : s2)
			sb2.append(temp);
		
		System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));
	}
}
