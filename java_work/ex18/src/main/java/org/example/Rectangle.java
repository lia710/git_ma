package org.example;

public class Rectangle {
    int x = 0;
    int y = 0;
    int width = 0;
    int height = 0;
    int n = 0;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        n = width * height;
        return n;
    }

    public void show() {
        System.out.println("x,y=" + x + "," + y + "넓이=" + this.square());
    }

    public boolean contains(Rectangle r) {
        if (r.x+r.width <=x+width && r.y+r.height<=y+height) {
            return true;
        }

        return false;
    }

}

