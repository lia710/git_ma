//class에 커서를 두고 F6하면 클래스가 밖으로 나온다
class Circle {
    private int rad; //private는 속한 클래스 안에서만  //setter getter로 참조 가능
    private String name; //<- this name
//기본 생성자는 생략가능
    //다른 생성자 선언시 기본 생성자 생략불가


    public Circle(int rad) {
        this.rad = rad;
    }

    public Circle(int rad, String name) {
        this.rad = rad;
        setName(name);
    }

    // 적당한 위치에 커서를 두고 alt+ insert 누르면 getter setter constructor 생성가능
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "홍길동";
            return;
        }
        this.name = name;

    }

    public void setRad(int r) {
        if (r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }

    public int getRad() {
        return rad;
    }


    public double getArea(){
        return 3.14*rad*rad;
    }
}
