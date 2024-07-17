public class Person {

    private String jumin;
    private String passport;

    public Person() {
    }

    public Person(String jumin) {
        this.jumin = jumin;
    }

    public Person(String jumin, String passport) {
//        this.jumin = jumin;
        this(jumin); //다른 생성자 안의 매개변수를 불러 올 수 있다
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "jumin='" + jumin + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void show(){
        System.out.print("jumin="+jumin+" ");
        System.out.println("passport="+passport);
    }

}
