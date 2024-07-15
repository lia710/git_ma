import java.util.Scanner;

/*
10진수 입력받아 2진수 출력...
*/
/*class= {데이터(필드,클래스 변수)
 메서드(함수,클래스 함수,인스턴스 함수)}*/
class Exam {
    Scanner scan = new Scanner(System.in);

    public int inputNumber() {
        System.out.println("숫자입력");
        int inputNumber = scan.nextInt();
        System.out.println("inputNumber().inputnumber=" + inputNumber);
        return inputNumber;
    }
}
