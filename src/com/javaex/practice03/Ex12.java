package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//팩토리얼 계산
		
		int i;
		int n=1;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("숫자를 입력하세요");
			i = sc.nextInt();
			
			System.out.print("결과값 :");
			
			for(int x=1; x<=i; x++) {
				n= n*x;
			}
			
			System.out.print(n);
			
			sc.close();
		}		

	}

}
