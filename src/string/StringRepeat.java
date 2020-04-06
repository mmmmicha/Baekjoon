package string;

import java.util.Scanner;

/*
 * 테스트번호 : 2675번
 * 테스트명 : 문자열 반복
 * @Kwanghyeon
 * 
 * */

public class StringRepeat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[][] arr = new String[n][2];
		
		for(int i=0; i<n; i++)
		{
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<arr[i][1].length(); j++)
			{
				for(int z=0; z<Integer.parseInt(arr[i][0]); z++)
					sb.append(arr[i][1].substring(j,j+1));
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
