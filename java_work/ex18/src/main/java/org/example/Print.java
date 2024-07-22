//package org.example;
//
//public class Print implements Printable{ // 인터페이스르 구현하다, 표현하다...
//
//    @Override
//    public void print() { //메서드 무조건 재정의
//        System.out.println("프린트 됨");
//    }
//    @Override
//    public void doA() {
//    }
//
//    public static void main(String[] args) {
//        Printable print = new Print();
//        print.print();
//
//        Printable p2 = new Printable() {
//            @Override
//            public void print() {
//                System.out.println("새로운 프린터");
//            }
//
//            @Override
//            public void doA() {
//            }
//        };
//        p2.print();
//    }
//
//}
//
