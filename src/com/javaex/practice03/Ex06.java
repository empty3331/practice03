package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		
		//1~100까지 수 중 5의 배수 이면서 7의 배수 구하기
		
		for(int i = 1; i<=100; i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("");

	}

}
