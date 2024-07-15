import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int nums[][]= new int[3][3];

        Arrays.fill (nums[0],10);
        Arrays.fill (nums[1],20);
        Arrays.fill (nums[2],30);

        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));

        System.out.println();
        int temp[]=nums[2]; //넘즈2 배열의 값이 사라지지 않도록 다른 배열에 저장
        nums[2] =nums[0];
        nums[0] = temp;

        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));
    }
}
