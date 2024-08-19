package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;

public class Ex03 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("TOY","BOX","ROBOT");

        list = new ArrayList<>(list); //불변객체 해제

        list.add("이거 안됨");

        System.out.println(list);
    }
}
