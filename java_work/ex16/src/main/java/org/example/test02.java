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

class Academi {
    int[] arr = {24, 94, 51, 10, 67};
    int add = 11;

    public Academi() {}
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }
}

class Student extends Academi {
int[][] arr = new int[][]{super.arr};
    public Student() {}
    public static void addTwoDArr(int[][] arr, int add) {
//        super(addOneDArr(for));

    }
    public void show(){
//        System.out.println(int[][] arr);
//    addOneDArr();
    }
}

    public class test02 {
        public static void main(String[] args) {
            Student stu = new Student();

            stu.show();

        }
    }
