package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {

		// 추상클래스로 객체 생성 불가 (왜? 미완성 클래스이기 때문에)
		//Sports s = new Sports();
		//Sports s; // 객체 생성이 안 될 뿐, 레퍼런스로는 사용 가능
		Sports s = new BasketBall(); // 다형성 적용시켜서 부모타입으로 자식 객체를 받아주는 형태 가능
		
		Sports[] arr = new Sports[2]; 
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		for(Sports a : arr) { // 변수 = arr[0]; => 변수 = arr[1];
			a.rule();
		}
		/*
		 * 동적바인딩: 컴파일 시점에서는 정적바인딩으로 현재 레퍼런스의 자료형의 클래스에 있는 메소드를 가리키긴 함.
		 * 			런타임 시점(실행 시점)에는 동적 바인딩으로 각각의 자식 클래스에 오버라이딩 된 메소드가 있을 경우 알아서 찾아져서 실행됨.
		 */
		
		/*
		 * * 추상메소드
		 * - 미완성된 메소드로 머리부만 존재하고, 몸통부({})가 구현되어 있지 않은 메소드
		 * 
		 * * 추상클래스
		 * - 미완성된 클래스
		 * - 객체생성 불가 (단, 레퍼런스 변수로는 선언 가능)
		 * - 일반 필드 + 일반메소드 [+ 추상메소드]
		 * 	=> 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
		 * 
		 * * 추상메소드가 없어도 추상클래스로 만들 수 있음 // 맨 위에 abstract만 붙이면 됨
		 * 	  언제 사용되나?
		 *   > 개념적: 단지 이 클래스가 미완성된 클래스라는 것을 부여할 목적
		 *   > 프로그래밍적: 객체 생성이 불가하게끔 하고자 하는 목적
		 *   
		 * * 추상메소드가 존재하는 추상클래스를 쓰는 이유
		 * - 부모클래스에 추상메소드가 존재할 경우
		 * 	  자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 됨!!
		 * 	 => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
		 * 		=> 메소드 통일성 확보 목적
		 * 		=> 표준화된 틀을 제공할 목적
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
