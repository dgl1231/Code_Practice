package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void testIf() {
		// �ܵ� if��
		// ���ǽ��� ����� ���̸� { }�ȿ� �ڵ� ����
		// ����� �����̸� { }�ȿ� �ڵ� ���� �Ѿ
		Scanner input = new Scanner(System.in);
		System.out.println("���ڸ� �� �� �Է��ϼ���");
		int num = input.nextInt();

		if (num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}
		if (num % 2 != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}

}
