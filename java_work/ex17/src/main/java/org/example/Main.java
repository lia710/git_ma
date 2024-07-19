package org.example;

import org.example.aa.KiaCar;
import org.example.aa.SamsungCar;

public class Main {
    public static void main(String[] args) {
        SamsungCar samsungCar = new SamsungCar("XM3", "별로", "삼성");
        KiaCar kiaCar = new KiaCar("K9", "비싸", "기아");

        //생성자의 용도:메모리화하면서 인스턴스 변수에 있는 내용을 선언,초기화,변경 하겠다
        samsungCar.show();
        kiaCar.show();

        System.out.println(samsungCar);
        System.out.println(kiaCar);
    }
}