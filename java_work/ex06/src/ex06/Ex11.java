package ex06;

import java.util.Iterator;

/*1. 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오
 *2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 계산하시오
 *3. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
 *4. for문을 while문으로 변경하시오
 * 
 * 다 하신분은 위의 문제를 함수호출로 변경하시오
 * */
public class Ex11 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <=i ;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
}
