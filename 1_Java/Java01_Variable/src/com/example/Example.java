package com.example;

import java.util.Scanner;

public class Example {
	public void example1() {
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ���");
		int num1 = input.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ���");
		int num2 = input.nextInt();

		System.out.println("���ϱ� ��� :" + (num1 + num2));
		System.out.println("���� ��� :" + (num1 - num2));
		System.out.println("���ϱ� ��� :" + (num1 * num2));
		System.out.println("������ �� :" + (num1 / num2));
		System.out.println("�������� ������ :" + (num1 % num2));
	}
	
	public void example2() {
		Scanner input =new Scanner(System.in);
		System.out.println("�����Է� : ");
		double weight = input.nextDouble();
		System.out.println("�����Է� : ");
		double height = input.nextDouble();
		
		System.out.println("���� : "+ weight*height);
		System.out.println("�ѷ� : "+ (weight+height)*2);
	}
	
	public void example3() {
		Scanner input =new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� :");
		String a=input.nextLine();
		System.out.println("ù��° ���� : " + a.charAt(0));
		System.out.println("�ι�° ���� : " + a.charAt(1));
		System.out.println("����° ���� : "+a.charAt(2));
		System.out.println("�Էµ� ���� ���� : " + a.length());
		
	}
}
