package com.poly.part01.test02;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		System.out.println("���� [1:����� 2:�۸���  3:�۾���");
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();

		Base base = null;// ���۷��� ����

		switch (select) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Dog();
			break;
		case 3:
			base = new Cow();
			break;
		}
		base.start();
		base.stop();
		/*  �������� ������� �ʴ´ٸ� �ڵ尡 �����
		Cat cat =null;
		Dog dog =null;
		switch (select) {
		case 1:
			cat=new Cat();
			break;
		case 2:
			dog = new Dog();
			break;
		case 3:
			base = new Cow();
			break;
			
		if(cat !=null){
		cat.start();
		cat.stop();
		}
		*/
	}

}
