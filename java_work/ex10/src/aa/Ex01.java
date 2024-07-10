package aa;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = new String("happy");
        String str2 = "happy"; // string class만 간략히 쓸 수 있다
        String str3 = "happy";


        System.out.println(str1 + " "+ str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2 == str3);
    }
}
// 문자열 비교는 .equals
