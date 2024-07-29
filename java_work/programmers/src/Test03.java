class Test03 {
    public int solution(int n) {
        int a=1;
        int b=1;
        int count=0;
        for (int i = 0; i < n; i++) {
            a++;
            b++;
            if (a * b == n) {
                System.out.println(a + "," + b);
                count++;
            }
        }
        int answer =count;
        return answer;
    }
}


