package org.example.aa;

public class BizMan extends Man {

    private String company;
    private String position;

    public BizMan(String name, String company, String position) {
        super(name); // 부모클래스에 기본 생성자가 있을때 super()가 생략됨 기본생성자에 값이 없으니 null 나옴
        this.company = company;
        this.position = position;
    }

    public void showInfo() {
        System.out.println("company = " + company);
        System.out.println("position + " + position);
        tellInfo();//super 생략 가능

    }
}
