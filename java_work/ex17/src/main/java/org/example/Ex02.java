package org.example;

import org.example.test.*;

public class Ex02 {
    // Springboot 프레임워크에서 사용
    // 부모클래스에 자식클래스를 담을 수 있다
    // 자식클래스 생성했을때 부모클래스로 참조 할 수 있다
    // 클래스 다형성
    public static void main(String[] args) {
        BB[] bary = new BB[10];
        CC[] cary = new CC[10];

        AA[] aary1 = new BB[10];
        AA[] aary2 = new CC[10];

        AA a1 = new BB();
        AA a2 = new CC(); // 부모클래스에 있는걸 참조만 가능,

        a1.bb(); // 부모클래스에 메소드가 없으면 출력 불가!
        a2.cc(); // 메소드 있으면 자식클래스에 재정의된 내용 가져옴


    }
}
