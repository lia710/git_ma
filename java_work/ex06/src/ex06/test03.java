package ex06;

import java.util.Iterator;

//3. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
public class test03 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0 ; i<100; i++)
		num1 = num1+ (i + 1);
		System.out.println(num1);
//	    num2 = i *-2;
		
//		for (; i < 200; i += 2) {
//			System.out.println("홀수 " + i);
//			for (; j >= -200; j -= 2) {
//
//				
//			}System.out.println("짝수" + j);
//			System.out.println(i+j);

		}
	}


