public class BankAccountmain {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();

        // 참조 변수(a나 b) 출력할때 tostring은 생략가능하다
        // 원래는 주소값 (16진수 0~f)이 나오는데 tostring은 내가 다시 정의 할 수 있다.

        System.out.println("a참조변수= "+a);
        System.out.println("b참조변수= "+b);

        a.mod();
        System.out.println();

        System.out.println("a참조변수= "+a);
        System.out.println("b참조변수= "+b);


    }
}
