package org.example;

class Board {
}

class PBoard extends Board {
}

public class Ex02 {
//실행중에 발생하는 에러는 코드상에서 확인하기 어렵다..
    public static void main(String[] args) {
        Board board = new PBoard();
        PBoard pBoard = (PBoard) new Board();

        System.out.println("success");
    }
}
