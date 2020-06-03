package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		//짝수,홀수 덧셈기
		
	int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i = sc.nextInt();
		
		
		if(i%2==0) {
			for(int x =0; x<=i; x++) {
				if(x%2==0) {
					sum = sum+x;}
			}
		}else {
			for(int x = 0; x<=i; x++) {
				if(!(x%2==0)) {
					sum = sum+x;
				}
			}
		}
		
		System.out.println(sum);
		
		

		sc.close();
	}

}
