package com.test01;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {
		new Operator05().opTest1();
	}

	public void opTest1() {

		Scanner input = new Scanner(System.in);

		System.out.println("���� �ϳ� �Է�: ");
		int num = input.nextInt();

		System.out.println("1���� 100������ �������� Ȯ�� : " + (num >= 1 && num <= 100));

		System.out.println("���� �ϳ� �Է�: ");
		char ch = input.next().charAt(0);

		System.out.println("�빮���ΰ�?" + (ch >= 'A' && ch <= 'Z'));
		
		System.out.println("��� �Ͻðڽ��ϱ�?(Y/N)  : ");
		char ch2 =input.next().charAt(0);
		
		System.out.println("������ y���� Ȯ�� : " + (ch2 =='Y' || ch2 =='y'));

	}
}
