package com.test01;

import java.util.Scanner;


public class IfTest03 {
	Scanner input = new Scanner(System.in);

	public void test() {
		int i = 10;
		int j = 20;

		if (i > j) {
			System.out.println(i + " ��" + j + " ���� Ů�ϴ�.");
		} else if (i == j) {
			System.out.println(i + " ��" + j + " �� �����ϴ�.");
		} else {
			System.out.println(i + " ��" + j + " ���� �۽��ϴ�.");
		}
	}

	public void test2() {
		System.out.println("������ �Է��ϼ���");
		int point = input.nextInt();
		String grade = "";
		if (point >= 90 ) {
			grade ="A";
		} else if (point >= 80 && point < 90) {
			grade ="B";
		} else if (point >= 70 && point < 80) {
			grade ="C";
		} else if (point >= 60 && point < 70) {
			grade ="D";
		} else{
			grade ="F";
		}
		System.out.printf("����� ������ %d �̰�, ����� %s�Դϴ�.",point,grade);
	}
	
	public void test3() {
		//���� ������ �� ��޺� �߰� ���� �̻��� ��쿡�� 
		//��޿� "+"��� ���ڸ� �߰��Ͽ� ���
		
		System.out.println("������ �Է��ϼ���");
		int point = input.nextInt();
		
		String grade = "";
		if (point >= 90 ) {
			grade ="A";
		} else if (point >= 80 ) {
			grade ="B";
		} else if (point >= 70 ) {
			grade ="C";
		} else if (point >= 60 ) {
			grade ="D";
		} else{
			grade ="F";
		}
		String buho="";
		if(point%10>=5) {
			buho="+";
			System.out.printf("����� ������ %d �̰�, ����� %s%s�Դϴ�.",point,grade,buho);
		}else {
			System.out.printf("����� ������ %d �̰�, ����� %s�Դϴ�.",point,grade);
		}
	}
}
