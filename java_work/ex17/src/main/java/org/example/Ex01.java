package org.example;

import org.example.phone.MobiePhone;
import org.example.phone.SmartPhone;

public class Ex01 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("5.0",123456789);
        smartPhone.show();

        System.out.println();
        MobiePhone mobiePhone = new MobiePhone(12345668);
        mobiePhone.show();
    }
}
