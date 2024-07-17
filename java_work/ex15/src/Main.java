import java.util.Arrays;

/*1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.

    입력 >>Hello.java
    출력
    파일명 Hello
    확장자 java

    문제풀이
    파일 업로드시에 exe 파일을 올릴 수 없도록 검사 할때
*/
class Main{
    public static void main(String[] args) {
        String str = "Hello.java";
        String temp[] = str.split("\\."); //()안에 정규표현식 찾아서 적용하기


        System.out.println(temp[0]);
        System.out.println(temp[1]);

        str = "Hello.Java";
        temp = str.split("[A-Z]");

        System.out.println(Arrays.toString(temp));

        str = "안1녕2하세3요";
        temp = str.split("\\d");

        System.out.println(Arrays.toString(temp));

        str = "안1녕2하세3요";
        temp = str.split("\\D");

        System.out.println(Arrays.toString(temp));


        if(temp[0].equals("exe"))
            return;
    }
}