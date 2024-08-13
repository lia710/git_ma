package org.example;

class Peaple implements Comparable<Peaple>{

    private String name;

    public Peaple(String name){
        this.name= name;
    }

    @Override
    public int compareTo(Peaple o) {
        return this.name - o.name;
    }

    @Override
    public String toString() {
        return "Peaple{" +
                "name='" + name + '\'' +
                '}';
    }

}

public class Ex06 {
    public static void main(String[] args) {


    }
}
