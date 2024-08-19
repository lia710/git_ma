package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBRepository {

    /*
    1. class.forname jar 파일 추가 확인
    2. Connection DB 연결
    3. PrepareStatment sql 구문 작성
    4. sql 구문 실행
    executeUpdate(); -> insert, update, create, alter 문 실행할때
    executeQuery(); -> select 문 실행할때
    */

    public void insert() {

        Connection conn = null;
        PreparedStatement pstmt = null;

        // Exception 소스 상에서 해결을 해야되고
        // RuntimeException 소스 상에서 해결 안해도 됨
        try {
            // DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.192:3306/lhj",
                    "root",
                    "1234");
            // sql 생성
            pstmt = conn.prepareStatement("INSERT INTO member (name,age) VALUES (?,?)");
            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1, name);
            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            // 문자열을 숫자로 형변환 Integer.parseInt
            pstmt.setInt(2, age);

            // sql 구문 실행
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
            }
        }

    }

    public void delete() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.192:3306/lhj",
                    "root",
                    "1234");
            // sql 생성
            pstmt = conn.prepareStatement("DELETE FROM member WHERE idx = ?");

            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));

            pstmt.setInt(1, idx);

            // sql 구문 실행
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
            }
        }
    }

    public void select() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        // select 해서 반환되는 테이블 받기
        ResultSet rs = null;

        try {
            // DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.192:3306/lhj",
                    "root",
                    "1234");
            // sql 생성
            pstmt = conn.prepareStatement("select * from member");

            // sql 구문 실행
            rs = pstmt.executeQuery();
            while (rs.next()) {
//               System.out.println("idx = "+rs.getInt("idx"));
//               System.out.println("name = "+rs.getString("name"));
//               System.out.println("age = "+rs.getInt("age"));
                System.out.println("""
                        idx = %d
                        name = %s age = %d
                        """.formatted(rs.getInt("idx"),
                        rs.getString("name"),
                        rs.getInt("age") ));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
            }
        }
    }

    public void Update() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.192:3306/lhj",
                    "root",
                    "1234");
            // sql 생성
            pstmt = conn.prepareStatement("Update member set NAME=?,age=? WHERE idx = ?");

            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1, name);

            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            pstmt.setInt(2, age);

            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));
            pstmt.setInt(3, idx);


            // sql 구문 실행
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
            }
        }
    }


}
