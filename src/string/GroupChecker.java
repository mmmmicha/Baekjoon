package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 테스트번호 : 1316번
 * 테스트명 : 그룹단어체커
 * @Kwanghyeon
 * 
 * 아직 불완전
 * 
 * */

public class GroupChecker
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<String> arrl = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean check = false;
		int answer = 0;
		
		for(int i=0; i<n; i++)
		{
			String temp = sc.next();
			
			for(int j=0; j<temp.length(); j++)
			{
				if(!arrl.isEmpty())
				{
					if(temp.substring(j, j+1).equals(arrl.get(arrl.size()-1)))
						arrl.add(temp.substring(j, j+1));
					else if(arrl.contains(temp.substring(j, j+1)) && !temp.substring(j, j+1).equals(arrl.get(arrl.size()-1)))
					{
						check = true;
						break;
					}
					else
					{
						arrl.add(temp.substring(j, j+1));
					}
				}
				else
				{
					arrl.add(temp.substring(j, j+1));
				}
			}
			System.out.println(check);
			if(!check)
			{
				answer++;
			}
			
			check = false;
		}
		
		System.out.println(answer);
		
	}
}
