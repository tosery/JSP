package com.example.myapp;

//객체간의 관계는 두가지
//1) 상속관계(A is a B) A는 B다. A는 B를 상속받았다.
//2) 포함관계(A has a B) A는 B를 가진다.

//이 경우는 바로 탱크가 되는 거다
//public class Car extends Tank{

//}

//포함관계가 많다.(현실적으로)

//public class 철수 {
//	private 여자 영희;
//}

interface Engine {
	void start();
}

class HyundaiEngine implements Engine {
	@Override
	public void start() {
		System.out.println("현대 엔진이 동작: 부릉부릉~");
	}
}

class ToyotaEngine implements Engine {
	@Override
	public void start() {
		System.out.println("도요타 엔진이 동작: 부릉부릉~");
	}
}

class FordEngine implements Engine {
	@Override
	public void start() {
		System.out.println("포드 엔진이 동작: 부릉부릉~");
	}
}


class Car {
	private Engine engine;// 업캐스팅(무슨 의미? 다형성) 자식타입의 객체를 부모타입 변수로 잡는거 부품 갈아끼우듯이!

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		engine.start();
	}
}

//포함관계로 만드려면
public class Ex {

	public static void main(String[] args) {
		Engine engine = new ToyotaEngine();

		Car car = new Car(engine); // 의존관계 설정 주입(Dependency Injection)
		car.drive();

		engine = new FordEngine();
		car.setEngine(engine);
		car.drive();

		car.setEngine(new HyundaiEngine());
		car.drive();
	}
}

//dao repository 보드컨트롤러 안에 DB작업을 repository를 통해서만 역할을 해준다.
