package aa;

// 클래스 정의
public class Box {
    String name;
    int count;

    /*
    기본 생성자는 생략가능 하지만
    다른 생성자를 선언할 시 기본생성자 생략 불가

    접근제어 지시자
    public protected default private
    */
    public Box() { //기본 생성자

        System.out.println("기본생성자 호출");
    }

    public Box(String n) {  //다른 생성자
        name = n;
        System.out.println("n 다른생성자 호출");
    }

    public Box(String n, int c) {  //다른 생성자
        name = n;
        count = c;
        System.out.println("n c 다른생성자 호출");
    }

    // 생략
    // toString() 주소값 출력
    // 개발자가 직접 적게되면 내용이 바뀐다
    public String toString() {
        return "Box name = " + name + " count = " + count;
    }

    // 메서드 이름이 동일할 수 없다
    public void doA() {
    }

    public void doA(String a) {
    } // 파라메타가 다르면 가능


}
