package ex04;

import java.util.Scanner;

public class test4 {
	//아래는 화씨(F)를 섭씨(C)로 변환하는 코드이다 변환공식이 '[°C] = ([°F]-32) / 1.8'라고 할때 (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값는 소수점 셋째자리에서 반올림해야 한다. (형변환이용)
	
	public static void main(String[] args) {
		int F = 100;
		//float C = (1);
	
		float c1= (float)((F-32)/1.8);
	System.out.println(c1);
	float d= (float)(c1*100+1);
	System.out.println(d);
	int D = (int)d;
		System.out.println(D);
		float C= (float)D/100;
		
	System.out.println("C = "+ C);
	System.out.println("F = "+ F);	
		}
	
			
		}
		
		
		

