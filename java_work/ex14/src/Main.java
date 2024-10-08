import java.util.Arrays;

/*3. 다음은 answer 배열 에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서
    그래프를 그리는 프로그램이다 에 알맞은 코드를 넣어서 완성하시오 .
    int[] answer = { 1,4,4,3,1,4,4,2,1,3,2}
    실행결과
    1***
    2**
    3**
    4****
*/public class Main {

    Main() {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2, 5, 9};
        int[] countNumber = {1, 2, 3, 4, 5, 9};
        int[] starNumber = new int[countNumber.length];
        System.out.println(Arrays.toString(answer));//배열의 내용을 한꺼번에 출력
        for (int j = 0; j < countNumber.length; j++) {
            for (int i = 0; i < answer.length; i++) {
                if (countNumber[j] == answer[i]) {
                    starNumber[j] = starNumber[j] + 1; // sum 같이 더한다
                }
            }
        }
        System.out.println(Arrays.toString(starNumber));
        for (int i = 0; i < starNumber.length; i++) {
            System.out.print((i+1)+" : ");
            for (int j = 0; j < starNumber[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}