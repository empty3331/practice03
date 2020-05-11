package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 숫자크기의 역삼각형 출력하기
		
		Scanner sc = new Scanner(System.in);
		int i,x,y;
		
		System.out.print("숫자를 입력하세요: ");
		i = sc.nextInt();
		
		for(y=1; y<=i; y++) {
			for(x=i; y<=x; x--){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		sc.close();

	}

}
