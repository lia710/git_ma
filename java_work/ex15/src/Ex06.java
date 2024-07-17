public class Ex06 {

    public static void main(String[] args) {
        String a = "asd";
        String b = "bsd";

        System.out.println(a+b);
        System.out.println("asd".concat(b));//String일때 문자열 더하기
        System.out.println(a.concat(b));

        System.out.println();
        System.out.println(a.compareTo("asd"));
        System.out.println(a.compareTo("ASD"));//대소문자 구분함, 대문자일때 양수
        System.out.println(a.compareTo("qtewew"));

        System.out.println();
        System.out.println(a.compareToIgnoreCase("ASD"));//대소문자 구분없이 비교, 같으면 0
        System.out.println(a.compareToIgnoreCase("Asd"));

        System.out.println();
        System.out.println(a.compareToIgnoreCase("ASda"));//다른 글자만큼 -갯수
        System.out.println(a.compareToIgnoreCase("AsDAFDe"));

    }


}
