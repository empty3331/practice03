package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// 숫자맞추기게임
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		String yn;
		int num = (int)(Math.random()*100)+1;
		int n;
		
		
		
		System.out.println("===============================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("===============================");
		
		

			while(true) {
		
				System.out.print(">>");
				n = sc.nextInt();
				
				if(n<num) {System.out.println("더높게");}
				else if(n>num) {System.out.println("더낮게");}
				else {System.out.println("맞았습니다.");break;}			
				
			}
			
			sc.nextLine();
		
			System.out.print("게임을 종료하시겠습니까?(y/n)>>");
			yn = sc.nextLine();
			if("y".equals(yn)) {
				System.out.println("===============================");
			    System.out.println("     [숫자맞추기게임 종료]     ");
			    System.out.println("===============================");
			    break;}

	  }
		
		sc.close();
	}
}
