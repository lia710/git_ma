package ex06;

public class Ex05 {

	// 보냈는 구구단 호출하는 메서드 => 2단 3단
	public static void aa(int dan) {
	System.out.println("aa");
	for (int i = 1; i < 10; i++) {
		System.out.println(dan*i);
		
	}
	
}
	// 두 수를 받아서 최소 공배수 출력하는 메서드
	// num1로 나누었을때 나머지가 0 그리고 num2로 나누었을때 나머지가 0
	public static void bb(int num1, int num2) {
	System.out.println("bb");
	int num = 0;
	while (num<50) {
		num++;
		if (num % num1 ==0 && num % num2 ==0) {
			System.out.println("최소공배수 ="+num);
			break;
		}
	}
}
	public static void main(String[] args) {
	System.out.println("프로그램 시작");
	aa(7);
	bb(3,5);
	System.out.println("프로그램 끝");
}
}
