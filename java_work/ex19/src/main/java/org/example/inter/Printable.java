package org.example.inter;

public interface Printable {
    // static final 변수를 대문자로 짓는게 관례

    public static final int HEIGHT = 70;
    int WIDTH = 120;

    //    public void doA(); // public 생략가능
    // default 붙이면 몸체 생성 가능
    void print(String mydoc);

    default void clean() { // 재정의 필요없음 new 객체 생성을 통해 출력가능(변수명.메소드명())
        System.out.println("청소기능 추가");
    }

    static void printline() { // static은 바로 출력가능(클래스명.메소드명())
        System.out.println("한줄 출력할 때 줄바꿈");
    }

}
