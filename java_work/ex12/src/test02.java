//2. 숫자로 이루어진 문자열 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
//        만일 문자열이 "12345" 면 ‘1+2+3+4+5’ 결과인 15를 출력하여야한다.
//        (1) 에 알맞은 코드를 넣으시오 .
//        [Hint] String클래스의 charAt(int i)을 사용


public class test02 {
    public static void main(String[] args) {
        int sum=0;
        String str = "12345";
        char[] chars = str.toCharArray(); //문자를 문자배열로 변환
        System.out.println(str.charAt(0)-'0');// 문자0에 해당하는 유니코드값을 빼주기
        System.out.println(str.charAt(1)-'0');
        System.out.println(str.charAt(2)-'0');
        System.out.println(str.charAt(3)-'0');
        System.out.println(str.charAt(4)-'0');

        for (int i = 0; i < chars.length; i++) {
            sum = sum + (chars[i]-'0');
        }
        System.out.println("sum="+sum);

    }
}
