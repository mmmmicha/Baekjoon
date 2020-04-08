package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 테스트번호 : 2941번
 * 테스트명 : 크로아티아 알파벳
 * @Kwanghyeon
 * 
 * 2020-04-06 아직 불완전(메모리 초과)
 * 
 * 2020-04-08 replaceAll 로 특정 문자로 치환 후 갯수세기
 * 
 * */

/* 오답 풀이 1
public class CroatiaAlphabet
{
	public static void main(String[] args) throws IOException
	{
		
		String[] set = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
		int answer = 0;
		
		while(sb.length()!=0) 
		{
			for(int i=0; i<set.length; i++)
			{
				if(sb.toString().contains(set[i]))
				{
					//System.out.println(set[i]);
					sb.delete(0, set[i].length());
					//System.out.println(sb.toString());
					answer++;
					i--;
					
				}
			}
			
			if(sb.length()>0) 
			{
				answer++;
				sb.delete(0, 1);
			}
			
		}
		
		System.out.println(answer);
		
	}
}
*/
public class CroatiaAlphabet
{
	public static void main(String[] args) throws IOException
	{
		
		String[] set = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		for(int i=0; i<set.length; i++)
		{
			if(s.contains(set[i]))
			{
				//System.out.println(set[i]);
				s = s.replaceAll(set[i], "*");
				//System.out.println(sb.toString());
			}
		}
		
		System.out.println(/* s+ " " + */s.length());
		
	}
}
