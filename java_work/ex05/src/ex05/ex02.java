
package ex05;

import java.util.Scanner;

public class ex02 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("입력 : ");
	int num = scan.nextInt();
	
System.out.println("num = "+ num);
System.out.println("num ="+num+(num > 0 ? "양수입니다":num==0? "0입니다":"음수입니다"));
}


}
