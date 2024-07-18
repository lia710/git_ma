/*

*/
class Grade{
    String name;
    double kor;
    double eng;
    double math;
    public Grade(){}
    public Grade(String name, double kor,double eng,double math){
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    public void reco(){
        double sum=kor+eng+math;
        double ever=sum/3;
    }
}
public class ex01 {
    Grade p = new Grade("강백호",90.0,85.5,70.0);

}
