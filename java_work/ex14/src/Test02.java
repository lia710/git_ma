/*1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.

    입력 >>Hello.java
    출력
    파일명 Hello
    확장자 java
*/
class PP {
    public static void doA() {
        String a = "Hello.java";

        String[] k = a.split("\\."); //("")의 문자를 기준으로 좌,우로 나눈다
        System.out.println("파일명 " + k[0]);
        System.out.println("확장자 " + k[1]);
    }
}


public class Test02 {
    public static void main(String[] args) {
        PP.doA();
    }

}
