/* Public static
변하지 않는 변수이고
모든 곳에서 참조하고 싶을때
클래스 구조 설계 해서 사용한다
*/
class InstClass{
    static int num = 0;
    InstClass(){
        num++;
        System.out.println(num);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(InstClass.num);
        InstClass in1 = new InstClass();
        InstClass in2 = new InstClass();
        new InstClass();
        new InstClass();
        System.out.println(in1.num);// 같은 공간을 공유하고 있기 때문에 같은 값을 공유한다
    }
}
