public class Main {
    public static void doA() {
        int i = 0;
        while (i < 10) {
            i++;
            int j = 0;
            while (j <= i) {
                j++;
                System.out.print("*");  //줄바꿈없이 출력

            }
            System.out.println();   //줄바꿈해라

        }

    }

    public static void main(String[] args) {
        doA();
    }
}
/*
i=0일때 j가 0~0이하까지 =>1번 반복
i=1일때 j가 0~1이하까지 =>2번
i=2일때 j가 0~2이하까지 =>3번
i=3일때 j가 0~3이하까지 =>0,1,2,3 4번
...
* */

