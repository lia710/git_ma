package org.example;

import org.example.aa.Box;

public class Ex01 {

    public Ex01() {
        Box box = new Box("myBox");
        System.out.println(box);

        //printf 서식문자(format문자)
        System.out.printf("%s", "문자열 출력\n"); //문자열
        int a = 10;
        int b = 20;
        System.out.printf("%d\n", a); // 정수
        System.out.printf("%f\n", (double) a); //실수
        System.out.printf("%o\n", a);

        System.out.println(String.format("%d+%d=%d", a, b, a + b));
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public static void main(String[] args) {
        new Ex01();
    }
}
