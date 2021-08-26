package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent{
	
	private int z;
	
	public Child1() {
		super(); // 생략되어있음. 기술하지 않아도 JVM이 자동생성해줌.
	}
	public Child1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("나 첫째 자식이야");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫째 자식이야");
	}
	
	
	
	
	

}
