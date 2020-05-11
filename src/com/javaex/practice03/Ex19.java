package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// 은행 프로그램
		
		Scanner sc = new Scanner(System.in);
		int sle, plu, min;
		int money = 0;
		boolean x = true;
		
		while(x) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			sle = sc.nextInt();
			
			switch(sle) {
			
			case 1 : 
				System.out.print("예금액>");
				plu = sc.nextInt();
				money = money +plu; break;
				
			
			case 2 : 
				System.out.print("출금액>");
				min = sc.nextInt();
				money = money -min; break;
				
				
			case 3 : 
				System.out.println("잔고액>"+ money); break;
				
			case 4 : System.out.println("프로그램 종료");
			         x= false; break; 
	
			
			default : System.out.println("다시입력해주세요");break; 
			
			}
			
		}
			
		
		sc.close();

	}
}
