package com.test.chap5.test02;

public class Run {

	public static void main(String[] args) {
		MethodTest mt=new MethodTest();
		
		//�Ű������� ��ȯ�� ���� �޼ҵ� ȣ��
		mt.method1();
		
		//�Ű����� ���� ��ȯ�� �ִ� �޼ҵ� ȣ��
		String str=mt.method2();
		System.out.println(str);
		
		//�Ű����� �ְ� ��ȯ�� ���� �޼ҵ� ȣ��
		mt.method3(1,2);
		
		//�Ű����� �ְ� ��ȯ�� �ִ� �޼ҵ� ȣ��
		System.out.println("result: "+mt.method4(3,4));
	}

}
