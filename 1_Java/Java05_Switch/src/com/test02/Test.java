package com.test02;

public class Test {
	public void test01(int i) {
	
		if(i%5==0) {
			System.out.println("5�� ����Դϴ�.");
		}else {
			System.out.println("5�� ����� �ƴմϴ�.");
		}
	}
	public void test02(int i) {
		if(i%2==0 && i%3==0) {
			System.out.println("2�� 3�� ����Դϴ�.");
		}else {
			System.out.println("2�� 3�� ����� �ƴմϴ�.");
		}
	}
	public void test03(char ch) {
		if(Character.isUpperCase(ch)) {
			System.out.println("�빮���Դϴ�.");
		}else if(Character.isLowerCase(ch)) {
			System.out.println("�ҹ����Դϴ�.");
		}else {
			System.out.println("��� �ƴմϴ�.");
		}
	}
}
