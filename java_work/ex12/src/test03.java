import java.util.Scanner;

//3. 프로그램 사용자로부터 10진수 형태로 정수를 하나 입력받은 다음, 이를 2진수로 변환해서 출력하는 프로그램을 작성해 보자.
public class test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        int num1 = scan.nextInt();
        //for (int i = 0; i < num1; i++) {
//        if (num1 % 2 != 0 || num1 % 2 != 1) {
//            System.out.println(num1 % 2);
//            if (num1 % 2 != 0 || num1 % 2 != 1) {
//                System.out.println(num1 % 2);
//                if (num1 % 2 != 0 || num1 % 2 != 1) {
//                    System.out.println(num1 % 2);
        int num2 = 1;
        num2 = num1 / 2;
        for (int i = 0; i < num2; i++) {
            if (num2 > 2) {
                System.out.println(num1);
                System.out.println(num2 / 2);
            } else if (num2 < 2) {
                System.out.println(num2 + num2 % 2);
            }
        }


    }


}






