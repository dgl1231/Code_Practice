package com.test01;

public class MethodTest02 {
	public static void main(String[] args) {
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//non static :  class ������ =new class();
		//������.�޼ҵ��();
		MethodTest01 test =new MethodTest01();
		test.NonStaticMehtod();
	}
}
