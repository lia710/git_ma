import java.util.Arrays;

public class Ex02 {
    /*
    "He11oWor1d"     "lloWorl" 2 "HelloWold"
    "Program29b8UYP" "merS123" 7 "ProgrammerS123"
     */
    Ex02() {
        System.out.println("여기로 온다");

        String result = solution("He11oWor1d", "lloWorl", 2);
        System.out.println(result);

    }

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] c_my_string = my_string.toCharArray(); //문자열을 문자배열로 변환
        char[] c_overwrite_string = overwrite_string.toCharArray();

        System.out.println(Arrays.toString(c_my_string)); //배열을 한번에 출력(확인)
        System.out.println(Arrays.toString(c_overwrite_string));

        System.arraycopy(c_overwrite_string,0, //바꿀꺼 첫번째 글자부터 전체 길이로
                c_my_string,s,overwrite_string.length()); //원래 배열에서 바꿀 자리 s번째에 적용

        System.out.println(c_my_string);
        answer = new String(c_my_string);
        return answer;
    }

    public static void main(String[] args) {
        new Ex02();
    }


}

