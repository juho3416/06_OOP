package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	//(기능 제공 클래스)

	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People() : 새로운 People 객체를 Heap영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다.
		// == 그래서 클래스를 "사용자 정의 자료형"이라고도 한다!! **
		
		//p1.name = "홍길동";
		//p1.age = 25;
		//p1.gender = '남';
		//p1.phone = "010-1234-1234";
		//p1.pNo = "200303-1234567";
		//p1.address = "서울시 중구 남대문로 120 대일빌딩 3층 강의장";
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setGender('남');
		p1.setPhone("010-1234-1234");
		p1.setpNo("200303-1234567");
		p1.setAddress("서울시 중구 남대문로 120 대일빌딩 3층 강의장");
		
		System.out.println("p1의 name : " + p1.getName());
		System.out.println("p1의 age : " + p1.getAge());
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 pNo : " + p1.getpNo());
		System.out.println("p1의 address : " + p1.getAddress());
		// 실행 클래스 없이 여기서는 출력 안됨.
		// main 메서드가 있는 실행 클래스에서 
		// AbstractionService를 객체화 시켜줘야 함.
		// 자바가 실행되면 main 메서드를 가장먼저 찾아서 실행함.
		
		// JAVA와의 약속으로 JAVA는 
		// 어플리케이션이 실행되면 제일먼저 메인(main)메소드를 실행한다.
		
		// 메인메소드는 자바 어플리케이션 실행시 제일먼저 동작하며 
		// 어느 객체에서든 접근할수 있으며 자바가 컴파일 되는 순간 
		// 정의되는 돌려주는 값이없는 함수.
				
		
		
		People p2 = new People();
		
		p2.setName("이름");
		System.out.println("p2의 name : " + p2.getName());
		
		p2.setAge(30);
		System.out.println("p2의 age : " + p2.getAge());
		
		p2.setGender('남');
		System.out.println("p2의 gender : " + p2.getGender());
		
		p2.setPhone("010-1234-5678");
		System.out.println("p2의 phone : " + p2.getPhone());
		
		p2.setpNo("801010-1234567");
		System.out.println("p2의 phone : " + p2.getpNo());
		
		p2.setAddress("서울시 강남구");
		System.out.println("p2의 address : " + p2.getAddress());
		
		
	}
}
