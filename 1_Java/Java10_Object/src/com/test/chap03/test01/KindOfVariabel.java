package com.test.chap03.test01;

public class KindOfVariabel {//Ŭ���� ������ ����
	//�ʵ� ==�������(Ŭ������ ������ ������ �ǹ�)==��������
	
	private int globalNum;
	
	public void testMethod(int num) {//�޼ҵ� ������ ����
	//�޼ҵ� ������ �ۼ��ϴ� ���� => ��������
	//�޼ҵ� ��ȣ �ȿ� �����ϴ� ����=> �Ű�����
		int localNum;
		
		//���� ���� ���� �ܿ� ����ϱ� ���ؼ��� �ݵ�� �ʱ�ȭ�� �Ǿ���Ѵ�.
		//System.out.println(localNum);
		System.out.println(num);
	}
	public void testMethod2() {
		System.out.println(globalNum);
	}
}

