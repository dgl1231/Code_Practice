package com.test01;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		Operator01.testMethod();
	}
	
	public static void testMethod() {
		// !���� : ������ �ݴ�� �ٲٴ� ������
		// !true =>false
		System.out.println("True�� ���� " + !true);
		System.out.println("False�� ���� " + !false);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�");
		int num =input.nextInt();
		System.out.println("�Է��� ������ ����ΰ�?" + (num>0));
	}
}
