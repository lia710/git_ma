/*2. 다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
public static void addOneDArr(int[] arr, int add){
    for(int i =0; i<arr.length; i++){
        arr[i] += add;
    }
}
위 메소드를 호출하는 형태로, int형 2차원 배열에 저장된 값 전부를 두번째 매개변수로 전달된 값의 크기만큼
증가시키는 메소드를 다음의 형태로 정의하자
public static void addTwoDArr(int[][] arr, int add){
    // 이안에 addOneDArr 메소드를 호출한다.
}
*/
package org.example;

import java.util.Arrays;

class Academi {
    public Academi() {}
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
            System.out.println(arr[i]);
        }
    }
}

class Student extends Academi {
    public Student() {}
    public static void addTwoDArr(int[][] arr, int add) {
        for (int i = 0; i < arr.length; i++)
            addOneDArr(arr[i],add);
    }
}

public class test02 {
    public static void main(String[] args) {
        int[] arr = {24, 94, 51, 10, 67};
        int[][] krr = {{1,2,3},{4,5,6},{7,8,9}};
        int add = 11;
        Academi academi = new Academi();
        academi.addOneDArr(arr, add);

        System.out.println();
        Student student = new Student();
        student.addTwoDArr(krr,add);

    }
}
