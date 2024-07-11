// 2의 n승 구하기
import java.util.Scanner;

class Fact {
    public int fact(int num) {
        //메서드는 반환값을 적게 되면 반환값이 무조건 있어야 한다.
        System.out.println("여기" + num);
        if (num > 0)
            return 2 * fact(num - 1);
        //2*fact(2)
        //2*2*fact(1)
        //2*2*2*fact(0)
        //2*2*2*1=8
        else {
            return 1;
        }
    }
}
// 2*2*2 num3
//2*2*2*2 num4

public class Main {
    public static void main(String[] args) {
        /* string -> int  Intefer.parseInt 외우기
         * int-> String 10+"";
         * 문자열 입력 scan.nextLine
         * 숫자입력 scan.nextint
         * */

        Scanner scan = new Scanner(System.in);
        System.out.println("몇승 구할래?");

        String a = scan.nextLine();//문자입력
        int num = Integer.parseInt(a);

        Fact fact = new Fact();
        int result = fact.fact(num);
        System.out.println("result="+result);
//        System.out.println(a);
//        System.out.println(num);
//        int num = scan.nextInt();//숫자입력

// 클래스의 정의와 인스턴스화

    }
}