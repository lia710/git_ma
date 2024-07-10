import java.util.Scanner;

//2. 피보나치 수열 은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다
//
//    예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 된다.
//    1,1,2,3,5,8,13,21,... 이렇게 진행된다
//    피보나치수열의 10 번째 수는 무엇인지 계산하는 프로그램을 완성하시오
public class test01 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;


        for (int i = 0; i < 10; i++) {//10번 나온다

            b = a + b;
            a = b - a;

        }System.out.println(a);


    }

}


/* 0,1,1,2,3,5,8,13,21,34,55
*n이 10일때 55
**/