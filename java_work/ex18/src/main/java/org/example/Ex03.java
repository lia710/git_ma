package org.example;

import org.example.friend.CompFriend;
import org.example.friend.UniFriend;

import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {

        int ucnt = 0;
        int ccnt = 0;

        UniFriend uniFriend[] = new UniFriend[10];
        CompFriend compFriend[] = new CompFriend[10];

        uniFriend[ucnt++] = new UniFriend("홍길동","010-9900-2600","ㅎㅎ");
        //0번째에 값을 넣고 1증가
        System.out.println(Arrays.toString(uniFriend));
        System.out.println(Arrays.toString(compFriend));

        System.out.println("ucnt="+ucnt);//증가된 1 출력
        for (int i = 0; i < ucnt; i++) {//0번째부터 1까지 출력
            uniFriend[i].showInfo();
        }
        for (int i = 0; i < ccnt; i++) {
            compFriend[i].showInfo();

        }
    }
}
