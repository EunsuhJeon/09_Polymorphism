package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		// 기억해둘 것! '=' 기준으로 왼쪽과 오른쪽의 자료형(타입)은 같아야됨!
		
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1(); // 기본생성자에서 super();로 부모객체를 호출하기 때문에 Heap 영역에 Parent객체 공간이 먼저 할당됨.
		c1.printChild1();
		c1.printParent(); // 아래구문이 자동으로 실행된것 (자동 형변환된것. child1=>Parent)
		
		c1.print();
		// c1 레퍼런스로 Child1, Parent 둘 다 접근 가능
		// (Parent 접근 시 자동으로 형변환 된 채로 진행)
		
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우(다형성)");
		Parent p2 = /*(Parent)*/new Child1(); // 자동형변환됨
		p2.printParent();
		((Child1)p2).printChild1();// 강제형변환을 하면 호출은 가능함!
		
		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환을 하면 접근 가능!
		
		/*
		 * 상속구조의 클래스들 간에서만 형변환이 가능함
		 * 
		 * 1. UpCasting
		 * 		자식타입 -> 부모타입으로 형변환
		 * 		자동형변환됨
		 * 		ex) 자식.부모메소드()
		 * 			부모 = 자식객체;
		 * 
		 * 2. DownCasting
		 * 		부모타입 -> 자식 타입으로 변환
		 * 		강제형변환 해야함
		 * 		ex) ((자식)부모).자식메소드();
		 * 
		 */
		//String str = (String)new Child1(); // 상속관계가 아니라서 xxx
		
		// * 다형성 정의
		// - 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로 모두 다룰 수 있음
		
		// * 다형성을 쓰는 목적(장점)
		
		// 다형성을 배우기 전..
		// Child1 객체 2개와 Child2 객체 2개를 관리해야 함
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2,1,5);
		arr2[1] = new Child2(5,7,2);
		
		// -------------------------------
		// 다형성을 적용한 후..
		Parent[] arr = new Parent[4];
	 // Parent
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(2,1,5);
		arr[2] = new Child2(5,7,2);
		arr[3] = new Child1(2,3,5);
		// 하나의 부모타입만으로 여러 자식객체들을 받을 수 있음 => 편리하다, 코드 길이 감소
		
		System.out.println("========================");
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		//((Child1)arr[2]).printChild1(); // ClassCastException
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("=====반목문 활용해서 출력=====");
		for(int i=0; i<arr.length; i++) {
			
			/*
			 * instanceof 연산자 => 연산 결과를 true/false로 반환
			 * 현재 레퍼런스가 실질적으로 어떤 클래스타입을 참조하는지 확인할 때 사용
			 */
			if(arr[i] instanceof Child1) { // 해당 레퍼런스가 실제 Child1 참조
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			
			/*
			if(i== 0 || i == 3) {
			((Child1)arr[i]).printChild1();
			}else {
			((Child2)arr[i]).printChild2();
			}
			*/
		}
		
		System.out.println("============================");
		
		//Parent pp = new Child1();
		//pp.print();
		/*
		 * 동적바인딩: 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩됨 (레퍼런스 타입의 메소드를 가라킴)
		 * 			단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩이 되어있다면
		 * 			프로그램 실행 시 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}
		
	}

}
