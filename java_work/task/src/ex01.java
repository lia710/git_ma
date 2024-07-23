class Grade {
    String name;
    double kor;
    double eng;
    double math;

    public Grade(String name, double kor, double eng, double math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void report() {
        double sum = kor + eng + math;
        double ever = (sum / 3);

        System.out.println(name+"의 평균 점수 : "+
                (double)Math.round(ever*100)/100);
    }
}
public class ex01 {
    public static void main(String[] args) {
        Grade k = new Grade("강백호", 90.0, 85.5, 70.0);
        Grade c = new Grade("채치수", 82.0, 92.0, 60.5);
        k.report();
        c.report();
    }
}
