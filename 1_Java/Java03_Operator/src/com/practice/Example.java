package com.practice;

import java.util.Scanner;

public class Example {

	public void sample1() {
		Scanner input = new Scanner(System.in);
		int i, j, k, m;
		double q;
		System.out.println("���� �����Է�: ");
		i = input.nextInt();

		System.out.println("���� �����Է�: ");
		j = input.nextInt();

		System.out.println("���� �����Է�: ");
		k = input.nextInt();

		m = i + j + k;
		q = m / 3;
		System.out.println("�հ�" + m);
		System.out.println("���" + q);
		System.out.println(((i >= 40 && j >= 40 && k >= 40)&&q>=60?"�հ�":"���հ�"));
	}
	public void sample2() {
		Scanner input =new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name=input.nextLine();
		
		System.out.println("�г��� �Է��ϼ���");
		int grade =input.nextInt();
		
		System.out.println("���� �Է��ϼ���");
		int clas =input.nextInt();
		
		System.out.println("��ȣ�� �Է��ϼ���");
		int num = input.nextInt();
		
		System.out.println("������ �Է��ϼ���(M/W)");
		char gender=input.next().charAt(0);
		
		System.out.println("������ �Է��ϼ��� ");
		double score =input.nextDouble();
		
		System.out.println(grade+"�г� "+clas +"�� "+num+"�� "+ (gender=='M'? "���л� ":"���л� ")+name+"�� ������ "+score+"�̴�");

	}
	
	public void sample3() {
		Scanner input= new Scanner(System.in);
		int num =input.nextInt();
		
		System.out.println(num>=0?"�����":"������");
	}
	
	public void sample4() {
		Scanner input= new Scanner(System.in);
		int num =input.nextInt();
		int na =num%2;
		
		String s=na%2==0?"¦����":"Ȧ����";
		System.out.println(s);
		
	}

}
