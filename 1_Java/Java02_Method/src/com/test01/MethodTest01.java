package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {
		//static method ����
		//Ŭ������.�޼ҵ��();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		MethodTest01.privateMethod();
		
		MethodTest01 test =new MethodTest01();
		test.NonStaticMehtod();
	}
	//��𼭳� ����,(+)
	public static void publicMethod() {
		System.out.println("public Method");
	}
	
	//����� ��� : ��ӵ� ������ (#)
	//����� �ƴ� ��� : ����� �ƴѰ�� ���� ��Ű�� ������
	protected static void  protectedMethod() {
		System.out.println("protected Method");
	}
	//���� ��Ű�� ������ (default)
	static void defaultMethod() {
		System.out.println("static default Method");
	}
	
	//���� Ŭ���� ��������(-)
	private static void privateMethod() {
		System.out.println("private Method");
	}
	public void NonStaticMehtod() {
		System.out.println("NonStatic Method");
	}
}
