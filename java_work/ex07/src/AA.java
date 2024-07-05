public class AA {
    public static void main(String[] args) {
//3. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
        //break-> while for swith 빠져나오기
        int sum = 0;
        for (int i = 1; i < 203 ; i++) {
            System.out.println("i=" + i);
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
            System.out.println("중간sum="+sum);
            if (sum>100)
                break;
        }
        System.out.println(sum);
    }

}

