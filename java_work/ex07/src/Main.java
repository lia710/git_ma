//shift+Delete 1줄 지우기
//shift+f10 현재 설정된 파일 실행
//ctrl+shift+f10 열려진 파일 실행
//ctrl+alt+L 자동정렬
//shift+enter 다음줄 열기
//alt+1 왼쪽 경로창 보기
//esc 소스로 이동
//alt+insert 파일 생성
//ctrl+E 최근 파일 찾기
//shift+shift 파일 찾기
//ctrl+f4 창닫기
public class Main {
    public static void main(String[] args) {
        /* 1+(1+2)+(1+2+3)...
        i=0일때 j가 0에서 0+1미만 반복해라
        i=1일때 j가 0에서 1+1미만 반복해라
        i=2일때 j가 0에서 2+1미만 반복해라
        i=3일때 j가 0에서 3+1미만 반복해라
        ...
        i=10일때 j가 0에서 10+1미만 반복해라
       */
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.println("j="+j);
                sum=sum+j;

            }
            System.out.println("sum="+sum);
        }
        System.out.println("sum="+sum);

    }
}