//1. 두 개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
public class GG_1 {
    public static void main(String[] args) {


        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {

                if (i+j == 6) {
                    System.out.println("i=" + i + "j=" + j);
                }
//                    System.out.println("value="+value);


            }



        }
    }
}
