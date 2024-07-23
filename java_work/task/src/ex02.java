import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int num = scan.nextInt();
            if (num == 0) {
                break;
            } else if (num != 0) {
                sum = sum + num;
                count++;
            }
        }
        if (count >0) {
            int ever = sum / count;
            System.out.print("합계는 " + sum + "입니다.");
            System.out.println("평균은 " + ever + "입니다.");
        }
    }
}






