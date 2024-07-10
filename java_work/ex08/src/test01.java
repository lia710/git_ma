import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
그리고 그에 따른 적절한 함수를 구현해 보자.
참고로 재귀 함수의 구현이 처음에는 어려운 편이기 때문에 여기서는 쉬운 문제를 제시하였다*/
public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result=1;
        for (int i = 0; i < n; i++) {
            result=result*2;
        }
        System.out.println(result);
    }


}
//20 21 22 23 24 25 26
//1  2  4   8 16 32 64
//2를 n번 곱하기
// n=2*n 으로 반복
// 1<<n 2진법으로 n번만큼 왼쪽으로 1이 이동하는 2의 n승 전용 연산자도 있음

