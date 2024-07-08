import java.util.Scanner;

/*2. 프로그램 사용자로부터 초(second)를 입력받은 후에,
이를 [시, 분, 초]의 형태로 출력하는 프로그램을 작성해 보자.*/
public class test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int m = s / 60;
        m = m % 60;
        int h = s / 3600;
        if (s > 60) {
            System.out.println(h + "," + m + "," + s % 60);
        } else {
            System.out.println(h + "," + m + "," + s);
        }
    }
}


// 1분/60초  1시간/60분
// 60s/m 60m/h
