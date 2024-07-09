import java.util.Scanner;

class Random {
    int a = (int) (Math.random() * 3);
}

//1. 가위 바위 보 게임을 만들어 보자.
//
//    사용자로부터 가위 바위 보 중에서 하나를 입력 받는다.
//    그리고 컴퓨터는 난수 생성을 통해서 가위 바위 보 중에서 하나를 선택하게 한다.
//     이 둘을 비교해서 승자와 패자를 가려주는 프로그램을 작성해 보자.
//    단 프로그램의 진행은 사용자가 질 때까지 계속되어야 하고,
//    마지막에 가서는 게임의 결과(예: 4승 3무)까지 출력해 주도록 하자.
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = 0;
        int t = 0;
        int l = 0;

        while (true) {
            String user = scan.next();

            if (user.equals("가위") || user.equals("바위") || user.equals("보")) {

            }else{
                continue;
            }
            Random R = new Random();
            int RC = R.a;
            String out = com(RC);
            System.out.println(out);


            if (out.equals(user)) {
                System.out.println("비김");
                t++;
            } else if ((out.equals("가위") && user.equals("바위"))
                    || (out.equals("바위") && user.equals("보"))
                    || (out.equals("보") && user.equals("가위"))) {
                System.out.println("이김");
                w++;
            } else {
                System.out.println("짐");
                l++;

                break;
            }
        }
        System.out.println(w + "승" + t + "무" + l + "패");
    }


    public static String com(int RC) {
        String n;
        switch (RC) {
            case 0:
                n = "가위";
                break;
            case 1:
                n = "바위";
                break;
            case 2:
                n = "보";
                break;
            default:
                n = "오류";
                break;

        }
        System.out.println("컴퓨터=" + n);
        return n;
    }
}







