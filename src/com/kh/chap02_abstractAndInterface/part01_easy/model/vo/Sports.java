package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {
		
	}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	public void setPoiple(int people) {
		this.people = people;
	}
	
	public String toString() {
		return "poeple: " + people;
	}
	
	// �߻� �޼ҵ� (�̿ϼ��� �޼ҵ�) �����
	public abstract void rule();
	
	
	
}
