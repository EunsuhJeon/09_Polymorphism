package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {
		
		//Person p = new Person();
		
		/*
		Person mom = new Mother("�����", 50, 70, "���");
		Person baby = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat(); // ������ +10, �ǰ��� -10
		baby.eat(); // ������ +3, �ǰ��� +1
		
		mom.sleep(); // �ǰ��� +20
		baby.sleep(); // �ǰ��� +3
		
		System.out.println("===========������===========");
		System.out.println(mom);
		System.out.println(baby);
		*/
		
		//Basic b = new Basic(); // ���۷��������δ� ��� �����ϳ� ��ü ������ �Ұ���!
		
		Basic mom = new Mother("�����", 50, 70, "���");
		Basic baby = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		baby.eat();
		mom.sleep();
		baby.sleep();
		
		System.out.println("==========������============");
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		 * Ŭ�������� Ŭ������ ��� ���� ��: Ŭ���� extends Ŭ���� (���ϻ�Ӹ� ����)	: ȭ��ǥ '�Ǽ�'
		 * Ŭ�������� �������̽��� ������ �� : Ŭ���� implements �������̽�, �������̽�, .. (���߻�� ����) : ȭ��ǥ '����
		 * �������̽����� �������̽��� ���: �������̽� extends �������̽�, �������̽�, .. (���߻�� ����) : ȭ��ǥ '�Ǽ�'
		 * 
		 * 			 | 	  	 �߻�Ŭ����			|		�������̽�
		 * =================================================================
		 * ��Ӱ��� 	 |		 ���ϻ��			| 		���߻��
		 * -----------------------------------------------------------------
		 * Ű����		 | 	     extends		| 	  implements
		 * -----------------------------------------------------------------
		 * �߻�޼ҵ�  	 | 	   �߻�޼ҵ� 0�� �̻� 		| 	  ��� �޼ҵ尡 �߻�޼ҵ�
		 * -----------------------------------------------------------------
		 * ǥ����/����	 | ��������� abstract ���	|	���������� abstract(��������)
		 * -----------------------------------------------------------------
		 * �Ϲݸ޼ҵ忩��|			O			|			X
		 * -----------------------------------------------------------------
		 * �ʵ�		 |	  �Ϲ��ʵ� ���� �� ����		|����ʵ常 ���� �� ����(���������� public static final)
		 * 
		 * extends �Ϲ�Ŭ���� --> extends �߻�Ŭ���� --> implements �������̽�
		 * ---------------------------------------------------------->
		 * 				�������� ���� �� £���� (�Ծ��� �� ������)
		 */
		
		/*��ü���� ���α׷����� 3�� Ư¡
		 * ĸ��ȭ
		 * ���
		 * ������
		 * (+4�� Ư¡: �߻�ȭ)
		 */
		
		
		
	}
	

}
