package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		//약수 구하는 프로그램
		
		 try (Scanner sc = new Scanner(System.in)) {
			int i,x;
			 System.out.print("숫자를 입력하세요: ");
			 i = sc.nextInt();
			 
			 for(x=1; x<=i; x++) {
				 if(i%x==0) {
					 System.out.println(x);
				 }
			 }
			  
			 sc.close();
		}
		

	}

}
