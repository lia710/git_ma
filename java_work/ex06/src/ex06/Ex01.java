package ex06;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	
	String age_type = sc.next();
	int answer = 0;

//	a == 10 숫자 비교
//	a.equals("10")문자열 비교
	
	if (age_type.equals("KOREA")) {
		answer =2030-year+1 ;
	}
	else if (age_type.equals("year")) {
		answer = 2030-year;
	}
	
	
	System.out.println("age_type=" + age_type);
	System.out.println("answer=" + answer);
	System.out.println("year="+year);
}
}

	
	
