// ctrl + 1
// alt enter 빠른 에러처리
public class EE {
    public static void main(String[] args) {
        int i = 0;
        double j = 0;

        while (true) {
            if (i < 0 && j < 5) {

            }
            i = i++;
            j = j++;
            System.out.println("i=" + i);
            System.out.println("j=" + j);

        }
    }
}
