package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	public void test() {
		int i = 2;

		switch (i) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		default:
			System.out.println("1,2,3 ��ξƴմϴ�.");
		}

		char ch = 'd';

		switch (ch) {
		case 'a':
			System.out.println("a�Դϴ�.");
			break;
		case 'b':
			System.out.println("b�Դϴ�.");
			break;
		case 'c':
			System.out.println("c�Դϴ�.");
			break;
		default:
			System.out.println("a,b,c ��ξƴմϴ�.");
			
		}
		
		String s="��";
		switch(s) {
		case "��":
			System.out.println("���̴�");
			break;
		case "��":
			System.out.println("���̴�.");
			break;
		case "���":
			System.out.println("����");
			break;
		default :
			System.out.println("��");
		}
		
		int no =2;
		switch(no) {
		case 1 :
		case 3 :
			System.out.println("Ȧ���Դϴ�.");
			break;
		case 2 :
		case 4 :
			System.out.println("¦���Դϴ�.");
			break;
		default :
			System.out.println("�ٸ�����!");
		}
		
	}
	public void test2() {
		//Ű����� ���� �ϳ� �Է�
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int month =input.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("�ܿ�");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("��");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("����");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("����");
			break;
		default :
			System.out.println("���� ���Դϴ�.");
		}
	}
	public void test3() {
		// ���� �ΰ��� �����ȣ(+,-,*,/)1���� �Է¹޾�
		//	�����ȣ�� �ش��ϴ� ����� �����ϰ� ���
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���");
		int num1 = input.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ���");
		int num2 =input.nextInt();
		
		System.out.println("�����ȣ�� �Է��ϼ���");
		char giho =input.next().charAt(0);
		
		switch(giho) {
		case '+':
			System.out.println(num1+" + "+num2 +" = " +(num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2 +" = " +(num1-num2));
			break;
		case '*':
			System.out.println(num1+" x "+num2 +" = " +(num1*num2));
			break;
		case '/':
			System.out.println(num1+" / "+num2 +" = " +(num1/num2));
			break;
		default :
			System.out.println("�����ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
	}
}
