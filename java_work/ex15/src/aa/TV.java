package aa;

public class TV {
    private String name;
    private int year;
    private int inch;

    public TV(String name, int year, int inch) {
        this.name = name;
        this.year = year;
        this.inch = inch;
    }//alt+insert로 constructor 사용, 전체 드래그해서 자동 생성 가능

    public void show() {
        System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
    }


    //    public TV(String n,int y,int in){
//        name=n;
//        year=y;
//        inch=in;
//    }

}
