//1. 배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요
public class test01 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = {10, 20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("총합 = " + sum);
        int ever = 1;
        int len = a.length;
        ever = sum / len;
        System.out.println("평균 = " + ever);
    }
}

