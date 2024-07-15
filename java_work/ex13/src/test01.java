import java.util.Scanner;

/*1. 문자열을 입력받아 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
    제한사항 1<= str의 길이 <=10
    입력
    abcde
    출력
    a
    b
    c
    d
    e*/
class A {
    Scanner scan = new Scanner(System.in);

    public String inputStr() {
        System.out.println("문자입력");
        String inputStr = scan.nextLine();
        System.out.println("inputStr=" + inputStr);
        return inputStr;
    }
}
public class test01 {
    public static void main(String[] args) {
        A ans = new A();
        String result = ans.inputStr();
        System.out.println("result=" + result);
        if (1 <= result.length() && result.length() <= 10) {
            for (int i = 0; i < result.length(); i++) {
                System.out.println(result.charAt(i));
            }

        }else{

        }


    }
}

