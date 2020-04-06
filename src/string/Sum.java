package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 테스트번호 : 11720번
 * 테스트명 : 숫자의 합
 * @Kwanghyeon
 * 
 * */

public class Sum
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split("");
		int sum = 0;
		
		for(String temp : s)
			sum += Integer.parseInt(temp);
		
		System.out.println(sum);
		
	}
}
