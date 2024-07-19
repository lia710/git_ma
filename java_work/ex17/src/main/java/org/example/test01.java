/* 다음 클래스 각각에 적절한 생성자를 삽입해보자. 물론 상속 관계를 고려하여 각 클래스 별로
 필요한 생성자를 삽입해야 한다.
public class Car {
    int gasolineGauge;
}

class HybridCar extends Car{
    int electricGauge;
}

class HybridWaterCar extends HybridCar{
    int waterGauge;
    public void showCurrentGauge(){
        System.out.println("잔여 가솔린 "+gasolineGauge);
        System.out.println("잔여 전기량 "+electricGauge);
        System.out.println("잔여 워터량 "+waterGauge);
    }
}
Car는 가솔린으로 동작하는 자동차를 표현한 것이고, HybridCar는 가솔린과 전기로 동작하는
자동차를 표현한 것이다. 그리고 HybridWaterCar는 가솔린과 전기뿐 아니라, 물도 동시에
연료로 사용할 수 있는 꿈의 자동차를 표현한 것이다. 그러나 이 문제는 위의 클래스들이
의미하는 바를 몰라도 해결이 가능하다.
*/
package org.example;

class Car {
    int gasolineGauge;

    public Car() {
    }

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린 car" + gasolineGauge);
    }
}

class HybridCar extends Car {
    int electricGauge;

    public HybridCar() {
    }

    public HybridCar(int gasolineGauge, int electricGauge) {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }

    public void showCurrentGauge() {
      super.showCurrentGauge();
        System.out.println("잔여 전기량 hycar" + electricGauge);
    }
}

class HybridWaterCar extends HybridCar {
    int waterGauge;

    public HybridWaterCar() {
    }

    public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
        super(gasolineGauge,electricGauge);
        this.waterGauge = waterGauge;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린 " + gasolineGauge);
        System.out.println("잔여 전기량 " + electricGauge);
        System.out.println("잔여 워터량 " + waterGauge);
    }
}

public class test01 {
    public static void main(String[] args) {
        HybridWaterCar hybridWaterCar = new HybridWaterCar(45, 24, 34);
        HybridCar hybridCar = new HybridCar(81, 26);
        Car car = new Car(100);

        car.showCurrentGauge();
        System.out.println();
        hybridCar.showCurrentGauge();
        System.out.println();
        hybridWaterCar.showCurrentGauge();
    }
}
