package com.poly.part01.test03;

//�������̽��� ��ӹ������� implements
public class Dog implements Animal{

	@Override
	public void bark() {
		System.out.println("�۸�");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed+" �Դ´�!!");
	}

}
