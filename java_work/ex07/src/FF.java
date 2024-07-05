public class FF {
    public static void main(String[] args) {
        System.out.println();
        // 0 < result < 1
        // 0 < Math.random < 1
        // 0.0000001 < result < 0.000000009
        for (int i = 0; i < 10; i++) {
            double result = Math.random()*100+3;

            System.out.println((int)result);
        }

    }
}
