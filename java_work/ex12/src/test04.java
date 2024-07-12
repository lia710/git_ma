import java.util.Arrays;
import java.util.Scanner;

/* 4. 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성해보자
예)
입력 abcdef
출력 fedcba

입력 안녕하세요
출력 요세하녕안
     */
public class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("문자열을 입력하시오");
        String[] A = new String[5];
        String a = scan.nextLine();
        char[] chars= a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        Arrays.fill(chars,0,5,chars[i-1]);


    }




}
