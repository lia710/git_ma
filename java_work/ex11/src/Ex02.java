import aa.*; // aa 패키지 안의 모든 클래스를 가져온다


public class Ex02 {
    public static void main(String[] args) {
A a = new A();
a.aa();

bb.A aa= new bb.A(33); // 클래스 명이 A로 같으면 풀패키지 입력
aa.bb();

Ex01 ex01 = new Ex01(); // 같은 경로라 import 안적어도 됨
    }
}
