package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    /*
    interface
    변수 : public static final 생략가능
    몸체가 없는 메서드 : public 생략가능
    void doA();

    class 만들어서 interface 상속 받아야 된다
    doA()메서드 재정의 필수

    default() static() 추가 가능하다
    메서드 안에 내용이 존재할 수 있음

    default() -> new 객체 생성하여 호출 가능
    static() -> Printable.doA() 직접적으로 클래스명.메서드명으로 호출 가능

    람다 규칙은
    interface 안에 하나의 추상메서드가 존재 해야한다
    ()->{}

    도커 데스크탑
    MYSQL sever 설치

    가상 OS
    docker run 명령어로 설치

    java 언어 접속
    heidisql 클라이언트

    try{} catch 구문이 필요하다
    예외상황

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("a : ");
            int a = scan.nextInt();
            System.out.println("b : ");
            int b = scan.nextInt();

            System.out.println("나누기 시작");
            System.out.println(a / b);
            System.out.println("나누기 끝");

            int c[] = new int[3];
            System.out.println(c[4]);

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("0으로 나눌 수 없습니다.");
        }catch (InputMismatchException ie){
            System.out.println("문자 넣으면 안돼요");
        }catch (Exception p){//앞서 만들어둔 Ari~,Input~ 예외를 제외한 모든 상황에서 적용
            System.out.println("이것은 모든 예외 상황");
        }

        System.out.println("정상 종료 되었습니다.");
    }
}
