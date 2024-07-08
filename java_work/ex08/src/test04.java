import java.util.Scanner;

/*4.두 개의 정수를 입력받아서 최대 공약수(GCD)를 구하는 프로그램을 작성해 보자.*/
public class test04 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();
        int sum = 1;

        for (int num3 = 2; num3 <= num1 * num2; num3++) {
            sum = num3 * sum;
            if (num1 % num3 == 0 && num2 % num3 == 0) {
                System.out.println(num3);
                System.out.println("sum="+sum);
            } else {
                num3 = num1 * num2;
                System.out.println(num3);
            }
        }


    }
}

