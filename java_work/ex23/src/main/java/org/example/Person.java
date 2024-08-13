package org.example;
// 글자 갯수 순서로..
public class Person implements Comparable<Person>{

    String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.length() - o.name.length();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
