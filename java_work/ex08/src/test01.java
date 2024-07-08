import java.util.Scanner;

/*1. 2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
그리고 그에 따른 적절한 함수를 구현해 보자.
참고로 재귀 함수의 구현이 처음에는 어려운 편이기 때문에 여기서는 쉬운 문제를 제시하였다*/
public class test01 {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();



}
//20 21 22 23 24 25 26
//1  2  4   8 16 32 64
//if else n=1
//   2*1 2*2 2*2*2 2*2*2*2
//   n(n-1) = n*(n-1)*(n-2)*(n-3)...
//2(0+1) 2(1+1) 2(1+1+1) 2(1+1+1+1)
//2를 n번 곱하기

