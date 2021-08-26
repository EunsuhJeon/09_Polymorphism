package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용 안 했을 때!!!
public class ElectronicShop1 {

	// 용산 전자상가에 있는 가게라고 생각
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	// 세 개의 제품 갖다놓기 위해 자리만 마련해둠
	
	// 오버로딩 적용된 것도 확인 가능!
	
	public void insert(Desktop d) {
		desk = d;
	}
	public void insert(NoteBook n) {
		note = n;
	}
	public void insert(Tablet t) {
		tab = t;
	}
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	
	
}
