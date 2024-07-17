/*1. Student 클래스를 작성하는 연습을 해보도록하자.
    Student클래스에 getTotal() getAverage() 과 를 추가하시오
    1. :  getTotal 메서드
    기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 :
        (kor), (eng), (math) .
        반환타입 : int
        매개변수 없음 :
    2. : getAverage 메서드
    기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
    소수점 둘째자리에서 반올림할 것.
    반환타입 : float
    매개변수 없음
*/
class Student {
    int kor;
    int eng;
    int math;
   int sum;

    public int getTotal(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        sum = kor + eng + math;
        System.out.println(sum);
        return sum;
    }
    public void getAverage() {

        float ever1 = sum / 3f; //float 값으로 나오게 나누려면 정수3에 float를 의미하는 f를 붙여준다
        float ever2 = (float)((int)(ever1*100))/100;
        System.out.println(ever2);

    }
}

public class test01 {
    public static void main(String[] args) {
        Student a = new Student();
        a.getTotal(48, 57, 94);
        a.getAverage();
    }
}
