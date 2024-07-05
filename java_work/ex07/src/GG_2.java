//2. Math.random을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하여라
public class GG_2 {
    public static void main(String[] args) {

//        int value = (1);
//
//        System.out.println("value="+value);

        // 0<x<1
        // 0.00000001<x<0.99999999
        // 0.00000006<x<5.49999999
        // int
        // 0<x<5
        //+1
        // 1<x<6
        for (int i = 1; i < 2; i++) {
            double value = Math.random() * 6 + 1;
            System.out.println((int) value);

//            System.out.println(value);

        }
        // 1. 주사위를 1~6 까지 숫자로 Math.random() 으로 만드는것
        // 0.00001~0.9999*10=123456789에서 789는 안나오게..
        // value는 랜덤하게 1개의 값만 나오도록
    }
}

