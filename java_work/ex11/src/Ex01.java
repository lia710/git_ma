public class Ex01 {
    public static void main(String[] args) {
        int total = 5000;
        System.out.println("DVD한편 빌려서 3500원");
        total = 3500;

        int cri = 500;
        int sa = 700;
        int coke = 400;

        total = total - (cri + sa + coke);
        System.out.println(total); //1개씩 사고 남은돈 1900

        System.out.println("3500원으로는 ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    if (1900 == (cri * i + sa * j + coke * k)) {
                        System.out.println("i=" + i + " j=" + j + " k=" + k);
                        System.out.println("크림빵은 " + (1 + i) + "개");
                        System.out.println("새우깡은 " + (1 + j) + "개");
                        System.out.println("콜라는 " + (1 + k) + "개 살 수 있다.");
                    }

                }

            }

        }


    }
}
