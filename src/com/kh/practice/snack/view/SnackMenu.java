package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	//사용자가 Snack객체에 데이터를 저장할 수 있도록 값을 받고
	//저장한 값을 출력하는 메소드
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String input1 = sc.next();
		System.out.print("이름 : ");
		String input2 = sc.next();
		System.out.print("맛 : ");
		String input3 = sc.next();
		System.out.print("개수 : ");
		int input4 = sc.nextInt();
		System.out.print("가격 : ");
		int input5 = sc.nextInt();
		
		System.out.println( scr.saveData(input1, input2, input3, input4, input5) );
		// println( 호출 및 값 전달 )
		
		System.out.print("저장된 정보를 확인하시겠습니까?(y/n) : ");
		String input6 = sc.next();
		
		if(input6.equals("y")) {
			System.out.println(scr.confirmData());
		}
		
		
		
	}

}
