package com.javaex.practice03;

public class Ex04 {

	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("===============");
	
		for(int i=10; i>0; i=i-2) {
			System.out.println(i);
		}
	
		/*
		 출력예상
		 
		 위에서 아래 순으로 프로그래밍 되므로
		 첫번째 for문이 실행된 후 탈출하면 두번째 for문이 실행된다.
		 
		 1
		 2
		 3
		 4
		 ===================
		 10
		 8
		 6
		 4
		 2
		 */
		
	}

}
