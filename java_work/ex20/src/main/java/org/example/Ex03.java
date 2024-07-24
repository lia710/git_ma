package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex03 {

    public static void md1() { //예외를 떠넘긴다
        Path file = Paths.get("simple.txt"); //파일생성코드 scanner 같은..

        // IOException 이 발생하기 때문에 try catch 로 해라
        try (BufferedWriter writer = Files.newBufferedWriter(file)){ //클래스.메서드(매개변수)
            // ^코드에 close()가 담겨있다
            writer.write('A'); // file에 A넣기
            writer.write("문자열도 적어 봅니당");

        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            try {
//                if (writer != null) { //writer에 값이 있을때
//                    writer.close();
//                } // 닫아라 종료
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


    }

    public static void main(String[] args) { // 예외처리를 여기서 try catch 로 해라
        try {
            md1();
        } catch (Exception e) { //IOException에 오류발생 할 때 파일이 깨지거나..
            System.out.println("파일 만들기 실패");
//            e.printStackTrace();
        }
    }

}
