package com.test01;

import java.util.Scanner;

public class WhileTest02 {
	Scanner input= new Scanner(System.in);
	public static void main(String[] args) {

//		new WhileTest02().testDoWhile();
		new WhileTest02().testDoWhile2();
	}
	public void testDoWhile() {
		int i =11;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		System.out.println("while ������ : "+ i);
	}
	
	public void testDoWhile2() {
		String str;
		do {
			System.out.println("���ڿ��� �Է��ϼ���");
			 str=input.next();
		}while(!(str.equals("end")));
		System.out.println("end�� �Է��߽��ϴ�.");
	}
}
