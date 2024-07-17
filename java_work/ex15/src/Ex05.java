public class Ex05 {
    public static void main(String[] args) {

        String str1 = "new String";
        String str2 = "new String";//같은걸 가리킴

        System.out.println(str1==str2);

        String str3 = new String("new String"); //new가 있으면 새로운 객체 생성
        String str4 = new String("new String");

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4)); //문자끼리 비교
        System.out.println(str1.equals(str2));
    }
}
