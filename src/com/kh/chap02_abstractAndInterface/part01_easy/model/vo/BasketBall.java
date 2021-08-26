package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class BasketBall extends Sports {

	// 추상메소드가 존재하는 추상클래스를 상속받는 순간
	// 부모클래스에 있던 추상메소드를 강제로 오버라이딩 해야 함
	
	@Override
	public void rule() {
		System.out.println("공을 항상 손으로만 쳐야된다.");
	}
}
