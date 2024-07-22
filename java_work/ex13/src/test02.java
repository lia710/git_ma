/*2. int[][] arr = {
        { 5, 5, 5, 5, 5},
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
    };
    arr 배열을 총합과 평균을 구하는 프로그램을 작성하세요*/
public class test02 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int sum = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num + arr[i].length; //arr 배열의 길이1씩 모든칸을 더해서 센다

            for (int e : arr[i]) {
                sum = sum + e; // arr 배열의 모든 값을 순서대로 더해서 총합을 구함
            }

        }
        System.out.println("총합:"+sum);

        System.out.println(num);
        System.out.println("평균:"+sum / num); //총합/모든 칸 수 = 평균
    }
}
