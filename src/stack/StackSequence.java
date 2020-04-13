package stack;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/*
 * 테스트번호 : 1874번
 * 테스트명 : 스택 수열
 * @Kwanghyeon
 * 
 * 메모리 초과
 * 
 * */

public class StackSequence
{
	
	public static int n;
	public static Stack<Integer> s;
	public static StringBuilder sb;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int n = Integer.parseInt(br.readLine());
		n = sc.nextInt();
		//System.out.println(n);
		int temp;
		int count = 1;
		
		s = new Stack<Integer>();
		s.push(-333);
		s.push(count++);
		sb = new StringBuilder();
		//String sb = null;
		//sb += "+\n";
		sb.append("+\n");
		
		int peek;
		
		for(int i=0; i<n; i++)
		{
			//temp = Integer.parseInt(br.readLine());
			temp = sc.nextInt();
			peek = s.peek();
			
			if(peek==temp)
			{
				s.pop();
				//sb += "-\n";
				sb.append("-\n");
			}
			else if(peek<temp)
			{
				while(count-1!=temp)
				{
					s.push(count++);
//					System.out.println("count : " + (count-1) + ", +");
					//sb += "+\n";
					sb.append("+\n");
				}
				s.pop();
//				System.out.println("count : " + (count-1) + ", -");
				//sb += "-\n";
				sb.append("-\n");
			}
			else if(peek>temp)
			{
				while(s.peek()!=temp)
				{
					/* int t = */s.pop();
					//System.out.println("count : " + t + ", -");
					//sb += "-\n";
					sb.append("-\n");
					
					if(s.peek()==-333)
					{
						System.out.println("NO");
						return;
					}
				}
				/* int c = */s.pop();
				//System.out.println("c : " + count);
				//sb += "-\n";
				sb.append("-\n");
			}
			
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}
}
