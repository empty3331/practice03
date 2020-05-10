package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("숫자를 입력하세요");
		z = sc.nextInt();
		
		for(x=1; x<=z; x++) {
			for(y=1; y<=x; y++) {
				System.out.print(x);
			}
			
			System.out.println("");
			
		}
		
		
		
		sc.close();
		
	}

}
