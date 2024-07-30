class Test03 {

    public int solution(int n) {

        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (a * b == n) {
                    count++;
                }
            }
        }
        int answer = count;
        return answer;
    }
}
class Test{
    public static void main(String[] args) {
        Test03 test03 = new Test03();
        System.out.println(test03.solution(100));
    }
}


