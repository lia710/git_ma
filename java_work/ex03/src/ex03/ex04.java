package ex03;

public class ex04 {
	
	public static void main(String[] args) {
		// 강제 형변환
		// int byte short 2byte
		// 8bit -> 1byte
		// 4bit -> 2byte
		int num1 = 4123540;
		
		//short 32000
		short num2 = (short) num1;
		
		// 자동 형변환
		// 반대 -> 자동형변환
		short num3 = 20;
		int num4 = num3;
	}

}
