package com.test01;

import java.util.Scanner;

public class Variable03 {
	// ���� ���� & �ʱ�ȭ
	// Ű����� �Է¹޾� ������ ����� �� ����
	public static void main(String[] args) {
		
		
		String name = "YiHanseul";
		char gender='W';
		int age=24;
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);

		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸� �Է�: ");
		name = input.nextLine();
		
		System.out.print("���� �Է�: ");
		gender = input.next().charAt(0);

		
		System.out.print("���� �Է� ");
		age =input.nextInt();
		
		System.out.println("�̸� : "+name +"\n���� : " + gender +"\n���� : "+age);
	}
}
