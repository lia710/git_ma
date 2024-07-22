package org.example;

import org.example.friend.CompFriend;
import org.example.friend.Friend;
import org.example.friend.UniFriend;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {

        int cnt = 0;
        Friend friend[] = new Friend[10];

        friend[cnt++]= new UniFriend("홍길동","010-1234-1234","컴퓨터"); //friend 배열의 0번째
        friend[cnt++]= new CompFriend("회사친구","010-9874-6541","개발팀");//friend 배열의 1번째

        System.out.println(Arrays.toString(friend)); //모두 출력이라 2번째 값 부터는 null로 출력

        for (int i = 0; i < cnt; i++) { //0부터 2전까지 0,1 배열의 값 출력
            friend[i].showInfo();
            System.out.println();

        }

    }
}
