package org.example;

class MyBox<T extends Number>{
    private T t;

    public T getT(){
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        MyBox<Integer> myBox1=new MyBox<>();
//        MyBox<String> myBox2 = new MyBox<>();  부모클래스가 Number라서 수에 관련된 것만 제네릭에 들어와야함
    }
}
