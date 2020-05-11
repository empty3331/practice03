package com.javaex.practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		//1부터n까지의 숫자 더하기 - 1
		
		int i,n;
		int j = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("숫자를 입력하세요: ");
			i = sc.nextInt();
		}
		for(n=1; n<=i; n++) {
			j=j+n;
		}
		
		System.out.println("합계: "+j);

	}

}
