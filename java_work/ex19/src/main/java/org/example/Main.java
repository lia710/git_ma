package org.example;
/*
ctrl + e 파일이동 , shift,shift 두번 누르기
ctrl + . 소스 접는 기능
*/

import org.example.inter.Printable;
import org.example.print.LGPrinter;
import org.example.print.SamPrinter;

public class Main {
    public static void main(String[] args) {
        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);

        Printable prn = new LGPrinter();
        prn.print("내 문서");

        prn = new SamPrinter();
        prn.print("내문서");

        // fianl 예약이 붙어 있어서 값의 변경이 불가능하다
//        Printable.HEIGHT = 90;



    }
}