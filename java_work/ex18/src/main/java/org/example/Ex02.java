package org.example;

import java.util.Arrays;

/*3. 다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자
1   2    3   //1행
4   5    6   //2행
7   8    9   //3행
이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는 메소드를 정의하자
7   8    9   //1행
1   2    3   //2행
4   5    6   //3행
물론 배열의 가로와 세로길이에 상관없이 위와 같이 동작하도록 메소드를 정의해야 한다.
*/
public class Ex02 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int temp0[] = arr[0]; // 다른 1차원 배열을 생성해서 값 저장
        int temp1[] = arr[1]; // []안에 숫자를 넣으면 배열의 칸수만 지정하게 되니
        int temp2[] = arr[2]; // 빈칸으로 두고 구분 할 수 있도록 배열명에 숫자를 표시

        arr[0] = temp2;
        arr[1] = temp0;
        arr[2] = temp1;


        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

//        System.out.println("temp");
//        System.out.println(Arrays.toString(temp0));
    }
}
// int test[]={1,2,3};
//int test1[]={4,5,6,7};
//int temp[][]={test,test1,{8,9,10,11}};
//
//int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//
//int dimension3[][][]={arr,temp};