import java.util.Arrays;

public class test04 {
    public int[] solution(int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n / 2];
        for (int i = 1; i <= n; i++) {
            arr1[i] = i++;
            if (i % 2 != 0) {
                arr2[i] = i;
            }
        }
        int[] answer = arr2;
        return answer;
    }
}
