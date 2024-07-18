package org.example.aa;

public class Man {
    private String name;

    public Man(){} //안에 super가 생략되어 있다
    public Man(String name) {
        this.name = name;
    }

    public void tellInfo() {
        System.out.println("name = " + name);
    }
}
