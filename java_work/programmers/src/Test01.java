public class Test01 {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.solution(3, 2));
    }

}

class Solution {
    public int solution(int num1, int num2) {
        int answer = (int) ((double) (num1) / (double) (num2) * 1000);
        return answer;
    }
}
