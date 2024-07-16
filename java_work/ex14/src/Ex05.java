import aa.Circle;

public class Ex05 {
    // 프로그램 시작시 main메서드는 메모리에 저장
    public static void main(String[] args) {

        System.out.println(Circle.PI);
        System.out.println(Circle.a);

        Circle c = new Circle();

        c.do둘레();
        c.do넓이();

        int result = c.doA();
        System.out.println(result);
    }
}
