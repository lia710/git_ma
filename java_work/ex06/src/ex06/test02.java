package ex06;
public class test02



//2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 계산하시오
// 1 3 6 10 15 21 28 class test02 
{
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for (int i = 1; i < 11; i++) {
//			System.out.println(i);
//			System.out.println("i = " + i);
			sum=sum+i;
			num=num+sum;
		
		
			
		}
			
		System.out.println(num);
			
		}
	}
