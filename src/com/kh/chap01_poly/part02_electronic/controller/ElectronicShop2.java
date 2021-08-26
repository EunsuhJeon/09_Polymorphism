package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

//다형성 개념을 적용!
public class ElectronicShop2 {
	
	// 부모타입 배열로 모든 자식 객체 다루기
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic e) {
		elec[count++] = any;
	}
	
	public void select(int index) {
		return elec[index];
	}
	
}
