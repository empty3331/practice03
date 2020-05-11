package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		//입력한 숫자에서 5의 배수의 갯수와 합계 구하기
		
		int i,n;
		int sum = 0;
		int count = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("숫자를 입력하세요: ");
			i = sc.nextInt();
			
			
			for(n=1; n<=i; n++) {
				if(n%5==0) {
					count++;
					sum = sum+n;
				}
			}
			
			System.out.println("5의 배수의 개수: " + count);
			System.out.print("5의 배수의 합 : "+ sum);
			
			sc.close();
		}
		
	}

}
