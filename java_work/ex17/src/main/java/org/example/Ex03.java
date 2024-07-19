package org.example;

import org.example.phone.MobiePhone;
import org.example.phone.SmartPhone;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Ex03 {
    //부모클래스에 있는 메소드는 상속되며
    //자식클래스에 동일한 이름의 메소드가 있으면
    //오버라이딩(재정의) 된다

    //오버플러우 오버로딩 오버라이딩 <-면접관 단골 질문
    public static void main(String[] args) {
        MobiePhone mobiePhone = new SmartPhone("6.0", 12345679);
        mobiePhone.show();
    }
}
