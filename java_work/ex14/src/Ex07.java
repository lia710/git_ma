import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.lang.Math.PI;

class AA{
    public static BB bb = new BB();
}
class BB{
    public void doA(){
        System.out.println("BB doA");
    }
}
public class Ex07 {
    public static void main(String[] args) {

        System.out.println(PI);
        AA.bb.doA();

        //윈도우 시간이라 변경가능
        //스태틱으로 저장돼 있음
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}
