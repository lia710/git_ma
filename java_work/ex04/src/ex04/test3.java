package ex04;

import java.util.Scanner;

public class test3 {
	//아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 456 이라면 400이 되고 111이라면 100이 된다. (1)에 알맞은 코드를 넣으시오
	
		public static void main(String[] args) {
			int num = 456;
		//	System.out.println(1);
			Scanner scan = new Scanner(System.in);
			System.out.println("값을 적으시오");
			double a = scan.nextDouble();
			int b = (int) (a/(double)100);
			System.out.println(b);
			System.out.println(b*100);
					
			
			
		}
	}

