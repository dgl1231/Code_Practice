package com.test01;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class IfTest02 {

	public void test() {
		int i = 2;

		if (i < 10) {
			System.out.println(i + " �� 10���� �۽��ϴ�.");
		} else {
			System.out.println(i + " �� 10���� ũ�ų� �����ϴ�.");
		}
	}
	public void test2() {
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		
		if(num %2 ==0){
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
	}
	public void test3() {
		//50���� ū����� ¦������, Ȧ������ ���
		Scanner input =new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i =input.nextInt();
		if(i>=50){
			if(i%2==0) {
				System.out.println("50���� ū ¦���Դϴ�.");
			}else {
				System.out.println("50���� ���� Ȧ���Դϴ�.");
			}
		}else {
			System.out.println("50���� �۴�");
		}
	}
	
	public void test4() {
		//���� �ϳ� �Է� �޾� ������� �������� ���. ��, 0�̸� "0�Դϴ�" ��� ���
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i==0){
			System.out.println("0�Դϴ�.");
		}else if(i>0){
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
	}
}
