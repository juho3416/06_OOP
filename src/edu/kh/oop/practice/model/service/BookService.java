package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		
		Book bk1 = new Book();
		Book bk2 = new Book("자바의정석", 30000, 0.2, "남궁성");
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		System.out.println("================================");
		System.out.println("수정된 결과 확인");		
		
		bk1.setTitle("C언어");
		bk1.setPrice(30000);
		bk1.setDiscountRate(0.1);
		bk1.setAuthor("홍길동");
		
		System.out.println(bk1.toString());
		
		double dsctdPrice1 = bk1.getPrice() * (1 - bk1.getDiscountRate());
		double dsctdPrice2 = bk2.getPrice() * (1 - bk2.getDiscountRate());
		
		System.out.println("================================");
		System.out.println("도서명 = " + bk1.getTitle());
		System.out.printf("할인된 가격 = %.0f원\n", dsctdPrice1);
		System.out.println("도서명 = " + bk2.getTitle());
		System.out.printf("할인된 가격 = %.0f원\n", dsctdPrice2);



	}
}
