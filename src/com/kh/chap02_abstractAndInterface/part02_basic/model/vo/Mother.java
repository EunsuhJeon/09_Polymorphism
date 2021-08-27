package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person implements Basic { // 클래스 간의 상속에서는 다중상속이 불가하지만, 인터페이스는 몇개든 상관 없음!!!

	private String babyBirth; // 아이의 탄생: 출산|입양|없음
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother[" + super.toString() + ", babyBirth=" + babyBirth + "]";
	}

	@Override
	public void eat() {
		// 밥을 먹으면 몸무게가 10 증가하도록
		super.setWeight(super.getWeight() + 10);
		// 건강도가 10 감소하도록
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 20);
	}
	
	
	
	
}
