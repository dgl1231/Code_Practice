package com.poly.part01.test06;

import java.util.Scanner;

public class Circle extends AreaImpl {

	@Override
	public void make() {
		Scanner input = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���");
		int r = input.nextInt();

		double res = r * r * Math.PI; // ����
		
		//super.setResult(res+"");
		setResult(String.format("%.2f", res));
	}
	@Override
	public void print() {
		System.out.print("���� ");
		super.print();
	}
}
