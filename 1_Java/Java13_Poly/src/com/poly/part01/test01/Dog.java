package com.poly.part01.test01;

//�߻�Ŭ������ ��ӹ������� �Ȱ��� extends�� �����.
//��, �߻� �޼��带 ������ ����ؾ��Ѵ�.
public class Dog extends Animal{
	
	//�߻�޼��鸦 �����ϰ� @Override�� �ؾ���
	@Override
	public void bark() {
		System.out.println("�۸۸�");
	}
	
	
	//eat�޼���� �߻�޼��尡 animalŬ�������� �ƴ϶� �ʼ��ƴ�.
	@Override
	public void eat(String animal) {
		super.eat(animal);
	}
}
