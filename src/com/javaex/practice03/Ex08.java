package com.javaex.practice03;

public class Ex08 {

	public static void main(String[] args) {
		//구구단 출력하기
		
		for(int x = 1 ; x<10; x++) {
			for(int y = 2; y<10; y++) {	
				System.out.print(y +"*"+ x + "="+ x*y + "\t" );	
				if(y%9==0) {
					System.out.println();
				}
			}									
		}		
		System.out.println();		
	}

}
