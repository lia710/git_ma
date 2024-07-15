public class Ex04 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);

        //반지름을 음수로 못넣게 막는 방법
//        circle1.rad = -10;
//        circle2.rad = 20;
        System.out.println(circle1.getRad());
        circle1.setRad(-10);
        System.out.println(circle1.getRad());

        Circle circle2= new Circle(0,"");
        System.out.println(circle2.getName());

    }
}
