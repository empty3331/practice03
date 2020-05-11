package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		//짝수,홀수 덧셈기
		
		int i, x, y;
		int sum =0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("숫자를 입력하세요");
			i = sc.nextInt();
			System.out.print("결과값: ");
			
			
			if(i%2==0) {			
				for(x=1; x<=i; x++) {
					if(x%2==0) {sum = sum+x;}
				}
			}
			
			
			else {
				for(y=1; y<=i; y++) {
					if(y%2==1) {sum = sum+y;}
				}
			}
					
			System.out.println(sum);
			
			sc.close();
		}
	}

}
