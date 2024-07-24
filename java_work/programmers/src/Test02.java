class Solution1 {
    public double solution1(int[] numbers) {
        float sum=0;
        float ever=1;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
            ever=sum/numbers.length;
        }
        System.out.println(ever);
        double answer = ever;
        return answer;
    }
}
public class Test02 {
    public static void main(String[] args) {
Solution1 sol= new Solution1();
    sol.solution1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
}
