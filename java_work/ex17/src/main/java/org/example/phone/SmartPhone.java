package org.example.phone;

public class SmartPhone extends MobiePhone{

    private String androidVer;

    public SmartPhone(String aver,int number) {
        super(number);
        this.androidVer = aver;
    }
    @Override //재정의 완벽히 같은 메소드의 내용변경
    public void show(){
        super.show();
        System.out.println("androidver = "+androidVer);

    }
}
