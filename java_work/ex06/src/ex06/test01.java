package ex06;

//1. 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오
public class test01 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;

		while (num <= 20) {
			num++;
			if (num % 2 != 0 && num % 3 != 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);

	}

}