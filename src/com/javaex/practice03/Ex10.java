package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		//5개 중 가장 큰 수 출력하기
		
		int n1, n2, n3, n4, n5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		n1 = sc.nextInt();
		System.out.print("숫자: ");
		n2 = sc.nextInt();
		System.out.print("숫자: ");
		n3 = sc.nextInt();
		System.out.print("숫자: ");
		n4 = sc.nextInt();
		System.out.print("숫자: ");
		n5 = sc.nextInt();
		
		
		System.out.print("최대값은 ");
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5) {
			System.out.print(n1);
		}		
		else if(n2>n1 && n2>n3 && n2>n4 && n2>n5) {			
			System.out.print(n2);
		}		
		else if(n3>n1 && n3>n2 && n3>n4 && n3>n5) {			
			System.out.print(n3);
		}
		else if(n4>n1 && n4>n2 && n4>n3 && n4>n5) {			
			System.out.print(n4);
		}
		else{			
			System.out.print(n5);
		}
		System.out.println("입니다.");
		
		
		sc.close();
		

	}

}
