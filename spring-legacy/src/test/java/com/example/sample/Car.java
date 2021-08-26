package com.example.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //스프링 빈 이 되어야하는 부분 표시
public class Car {
	private Engine engine;// 업캐스팅(무슨 의미? 다형성) 자식타입의 객체를 부모타입 변수로 잡는거 부품 갈아끼우듯이!

	@Autowired//타입(Engine)을 기준으로 스프링빈 안에서 의존객체를 찾아서 주입해준다
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
