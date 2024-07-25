package org.example;
//Cloneable 인터페이스를 재정의해서 Clone메서드를 사용하게 되면 객체복사가 일어난다
public class Point implements Cloneable{
    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public void showPoint(){
        System.out.printf("[%d,%d]\n",xpos,ypos);//printf의 특성: 입력값의 형태지정
    }//%d정수   %f실수  %c문자  %s문자열

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }
}
