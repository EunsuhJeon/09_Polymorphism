package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;

public class ElectronicRun {

	public static void main(String[] args) {
		
		// ����� Ŭ������ ��ǰ��ü��� ����!��
		
		/*
		// 1. ������ ���� ������ ��� (ElectronicShip1) ========
		ElectronicShop1 es = new ElectronicShop1();
		// ��ü�����ϴ� ���� �ش� Ŭ������ ���õ� ��  �ʵ尡 �޸� �� �Ҵ�
		
		// ��ǰ�� ��
		es.insert(new Desktop("samsung", "��ž", 1200000, ""));
		es.insert(new NoteBook("LG", "�׷�", 2000000,4));
		es.insert(new Tablet("Apple", "�����е�", 800000, false));
		
		// ��ȸ
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 2. ������ �������� ��� (ElectronicSop1) ==========
		ElectronicShop2 es = new ElectronicShop2();
		es.insert(new Desktop("samsung", "��ž", 1200000, "Gefore1070"));
		es.insert(new NoteBook("LG", "�׷�", 2000000,4));
		es.insert(new Tablet("Apple", "�����е�", 800000, false));
		
		/*
		Desktop d = (Desktop)es.select(0);
		Notebook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		*/
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(1);
		
		System.out.println(d/*toString()*/);
		System.out.println(n);
		System.out.println(t);
		
		System.out.println(((Desktop)d).getGraphic());
		
		/*
		 * * �������� ����ϴ� ����
		 * 1. �θ�Ÿ���� �迭�� �پ��� �ڽİ�ü���� ���� �� ����
		 * 2. �޼ҵ� ���� �� �Ű������� �������� �����ϰ� �Ǹ� �޼ҵ� ������ Ȯ �پ��!
		 */
		
	}

}