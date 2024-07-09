import java.util.Scanner;
import aa.bb.fact;
public class Main {
    public static void main(String[] args) {
        // 입력받는 변수 선언
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 입력");
        int result =scan.nextInt(); //사용자의 입력 대기

        fact fact1 = new fact();
        int retValue = fact1.aa(result);

        result = fact1.aa(5);

        System.out.println("result ="+result);
        System.out.println("retValue="+retValue);
    }
}