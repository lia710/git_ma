package ex06;

import java.util.Scanner;

public class Ex09 {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("곱하고 싶은 값 입력 :");
			int input = scan.nextInt();
			System.out.println(doA(input));
		}
	}
	//int와 return은 같이 다닌다
	public static int doA(int num) {
		return num * num;
	}
		

}
