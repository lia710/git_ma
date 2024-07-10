package aa;

import java.util.Scanner;

public class CC {
    //초를 입력받는 함수
    public int inputNumber() {
        System.out.println("초입력: ");
        Scanner scan = new Scanner(System.in);
        int result = scan.nextInt();
        return result; // int(반환값이 있을때) return은 호출할때 반드시 함께한다
    }

    //int를 넘겨주면 string을 반환하는 함수
    // 21747 -> 6시간 2분 27초
    public String calculate(int second) {
        int hour = second / 3600;
        int min = (second % 3600) / 60;
        int sec = (second % 3600) % 60;
        return hour + "시간 " + min + "분 " + sec + "초";
    }
    // 1시간 3600초 60*60
    // 1분 60초


    // tostring은 생략된 문법이다.

//public String toString() {
//    return "3b07d329"
//}

}
