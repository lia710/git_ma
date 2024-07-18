package org.example.aa;
// 기본생성자는 다른 생성자를 선언하게 되면 생략불가
// 상속관계에서는 부모클래스의 기본생성자를 호출하는게(super) 있는데 생략되어져 있다
// 부모클래스에 기본 생성자가 선언되지 않을때 다른 생성자 호출을 통해 부모클래스 생성자를 호출할 수 있다.
public class FriendMan extends Man {
    private String place;

    public FriendMan(String name){
        super(name); // 기본생성자 있을때는 여기 이 생성자 모두 안적어도 된다
    }
}
