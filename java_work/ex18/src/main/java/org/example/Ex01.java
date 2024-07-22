package org.example;

import java.util.Arrays;

public class Ex01 {

    public static void doA(int temp){
        temp += 5;
        System.out.println("do A temp"+temp);
    }
    public static void doA(int[] crr){
        for (int i = 0; i < crr.length; i++) {
            crr[i] +=5;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a =10; //int는 값 복사
        doA(a); // 복사된 a값을 적용해서 결과 도출
        System.out.println(a);//원래의 a값을 그대로 도출

        int arr[]={1,2,3}; //배열은 주소복사
        doA(arr);// arr의 주소와 crr의 주소가 같아서 변한 값이 동일하게 적용된다
        System.out.println(Arrays.toString(arr));//동일하게 적용된 값의 주소를 불러온다

    }
}
