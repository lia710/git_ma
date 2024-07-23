class Solution {
    public double solution(int[] numbers) {
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;
        float ever=1;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
            ever=(float)sum/numbers.length;
            if (sum% numbers.length==0) {
                ever=(float)((sum/numbers.length)*10)/10;
            }else if (sum% numbers.length==5) {
                ever=(float)((sum/numbers.length)*10)/10;
            }
        }
        double answer = ever;
        return answer;
    }
}
public class Test02 {
    public static void main(String[] args) {

    }
}
