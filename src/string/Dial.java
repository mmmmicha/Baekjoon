package string;

import java.util.Scanner;

/*
 * 테스트번호 : 5622번
 * 테스트명 : 다이얼
 * @Kwanghyeon
 * 
 * */

public class Dial
{
	public static void main(String[] args)
	{
		String[] dial = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		int ans = 0;
		
		for(int i=0; i<inp.length(); i++)
		{
			sb.append(inp.charAt(i));
			
			for(int j=3; j<dial.length; j++)
			{
				if(dial[j].indexOf(sb.toString())!=-1)
					ans += j;
					
			}
			
			sb.delete(0, 1);
		}
		
		System.out.println(ans);
	}
}
