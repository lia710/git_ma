public class Ex07 {
    public static void main(String[] args) {
       // 속도가 빠르다
        // 짧은 문자열은 속도 차이 없으니 string 쓰고, 긴 문자에서 사용
        StringBuilder sb = new StringBuilder();
        sb.append("asdf"); //더하기
        sb.append("asdf");

        System.out.println(sb);

        sb.delete(0,2); //0에서 2번째전까지 지워라
        System.out.println(sb);

        sb.replace(0,5,"kkk"); //0에서 5번째 전까지 kkk로 바꿔라
        System.out.println(sb);

        sb.append("asdf"); // asdf를 더하고
        sb.reverse(); // 뒤집어라
        System.out.println(sb);
    }
}
