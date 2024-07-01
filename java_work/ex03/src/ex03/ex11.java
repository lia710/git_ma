package ex03;

public class ex11 {
	
	
	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		
		// boolean true or fault 로 결과값을 표시
		boolean result;
		
		result = 3 <= num1 && num1 <= 100;
		
		System.out.println(result);
		
		result = num1%3==0;
		System.out.println(result);
		
		result = num1%2==0;
		System.out.println(result);
		
		result = ((num1%3==0) && (num1%2==0)) || (num2 % 2 == 0) ;
		System.out.println(result);
	}

}
