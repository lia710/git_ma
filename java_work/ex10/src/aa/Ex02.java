package aa;
class B{
    // toString 생략 개발자 임의적으로 적게되면 적었는 내용 실행
    // 생성자도 생략 가능
    int a = 10;
    // 생략된 문법 // 생성자
    public B(){
        System.out.println("생성자");
        a=20;
    }
    //생략된 문법
//    public String toString(){ return "djashgkd"}
}
public class Ex02 {
    public static void main(String[] args) {
    // 생성자는 함수랑 비슷한 모양이지만 반환값을 적지 않는다.
     B b = new B();
        System.out.println(b.a);



    }
}
