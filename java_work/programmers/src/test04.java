import java.util.Arrays;

public class test04 {
    public static void main(String[] args) {

        Solution so = new Solution();
        so.solution(10);


    }
    static class Solution{
    public int[] solution ( int n){

        int[] arr = new int[n / 2];
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                arr[i] = n;
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
            }
        }
        int[] answer = arr;
        return answer;
    }
}}
