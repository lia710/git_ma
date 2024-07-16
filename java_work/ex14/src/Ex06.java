class Test{
    public static void doA(){
        System.out.println("static doA");
    }
    public void doB(){
        System.out.println("instance doB");
    }
}
public class Ex06 {
    int num = 0;
    static void Add(int n){
        // static에서 static 없는 변수를 쓸 수 없다.
//        num +=n;
    }



    public static void main(String[] args) {
        Test.doA();
        Test test = new Test();//객체 선언하고 static이 없는 doB함수 호출가능
        test.doB();

        test.doA(); //되긴 되지만 쓰지마라
    }
}
