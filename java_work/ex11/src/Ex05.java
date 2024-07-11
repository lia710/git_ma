public class Ex05 {
    public static void main(String[] args) {
                        //0     1       2번째
        String str = "안녕하세요|박명회|선생님입니다.|";
        String[] tempstr = str.split("\\|"); //1을 기준으로 잘라라

        for (int i = 0; i < tempstr.length; i++) { // 길이만큼
            System.out.println(tempstr[i]);
        }

        String a = "abcdefgh";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));

        System.out.println(a.substring(2)); //2에서 잘라서 3번째 문자부터 나타내기
        System.out.println(a.substring(2,5)); //2에서 자르고 3~5사이의 문자만 나타내라
        System.out.println(a.toUpperCase()); //대문자
        System.out.println("cd를 포함하냐 = "+a.contains("cd"));

        System.out.println("배열출력시작");
        char[] test = "테스트".toCharArray(); //Char 캐릭터 한글자씩
        for (int i = 0; i < test.length; i++) {
            System.out.println("test["+i+"]"+test[i]);
        }
        System.out.println("배열출력끝");

        test[2] = 'A';
        String testStr = new String(test);
        System.out.println(testStr);

        int[] b = new int[3];
        System.out.println(b.length);
    }
}
