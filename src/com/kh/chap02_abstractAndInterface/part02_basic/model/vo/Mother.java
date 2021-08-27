package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person implements Basic { // Ŭ���� ���� ��ӿ����� ���߻���� �Ұ�������, �������̽��� ��� ��� ����!!!

	private String babyBirth; // ������ ź��: ���|�Ծ�|����
	
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
		// ���� ������ �����԰� 10 �����ϵ���
		super.setWeight(super.getWeight() + 10);
		// �ǰ����� 10 �����ϵ���
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 20);
	}
	
	
	
	
}
