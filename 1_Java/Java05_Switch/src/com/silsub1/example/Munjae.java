package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	Scanner input = new Scanner(System.in);

	public void test1() {
		System.out.println("���� ���� �Է�");
		int kor = input.nextInt();
		System.out.println("���� ���� �Է�");
		int eng = input.nextInt();
		System.out.println("���� ���� �Է�");
		int math = input.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		int i;
		if (avg >= 60 && (kor >= 40 && eng >= 40 && math >= 40)) {
			i = 1;
		} else {
			i = 0;
		}
		switch (i) {
		case 0:
			System.out.println("���հ�");
			break;
		case 1:
			System.out.printf("���� :%d ���� :%d ���� :%d �հ� :%d ��� : %f", kor, eng, math, sum, avg);
			break;
		}
	}

	public void test2() {
		System.out.println("*** �ʱ� �޴� ***");
		System.out.println("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n7. ����");
		System.out.print("�޴���ȣ �Է� :");
		int i = input.nextInt();

		switch (i) {
		case 1:
			System.out.println("�Է¸޴��� ���õǾ����ϴ�.");
			break;
		case 2:
			System.out.println("�����޴��� ���õǾ����ϴ�.");
			break;
		case 3:
			System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");
			break;
		case 4:
			System.out.println("�����޴��� ���õǾ����ϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.");
			System.out.println("�ٽ� �Է��Ͻʽÿ�");
		}

	}

	public void test3() {
		System.out.println("������ �Է��ϼ���");
		int i = input.nextInt();

		if (i > 0) {
			System.out.println("�����");
		} else {
			System.out.println("����� �ƴϴ�");
		}

	}

	public void test4() {
		System.out.println("���� ������ �Է��ϼ���");
		int i = input.nextInt();
		String s;

		if (i >= 0) {
			if (i % 2 == 0) {
				s = "¦����";
				System.out.println(s);
			} else {
				s = "Ȧ����";
				System.out.println(s);
			}
		} else {
			System.out.println("��� �Է����ּ���");
		}
	}

	public void test5() {
		System.out.println("�̸� �Է��ϼ���");
		String name = input.nextLine();
		System.out.println("���� �Է��ϼ���");
		int age = input.nextInt();
		System.out.println("Ű �Է��ϼ���");
		double tall = input.nextDouble();

		if ((name != null) && (name.length() > 0) && (age > 0) && (tall > 0)) {
			System.out.println("�̸� : " + name);
			System.out.println("���� :" + age);
			System.out.println("Ű : " + tall);
			System.out.printf("%s�� ���̴� %d���̰�, Ű�� %.2f cm�̴�.", name, age, tall);
		} else {
			System.out.println("�ٽ� �Է��ϼ���");
		}

	}

	public void test6() {
		System.out.println("ù��° ���� �Է�");
		int n1 = input.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int n2 = input.nextInt();

		if (n1 > 0 && n2 > 0) {
			System.out.println("ù��° ���� :" + n1);
			System.out.println("�ι�° ���� :" + n2);
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			System.out.printf("%d %% %d = %d ",n1,n2,n1%n2);
		} else {
			System.out.println("���� ���� �Է��ϼ���");
		}
	}

	public void test7() {
		System.out.println("���� ������ �Է��ϼ���");
		int i = input.nextInt();
		if (i >= 0) {
			if (i >= 90) {
				System.out.println("A");
			} else if (i >= 80) {
				System.out.println("B");
			} else if (i >= 70) {
				System.out.println("C");
			} else if (i >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else {
			System.out.println("�߸��� ���� �Դϴ�.");
		}
	}
}
