package com.test01;

public class Variable01 {
	// Ÿ�� ������;
	// ������ = ��;
	public static void main(String[] args) {
		//�غ�
		// ���� ����� �޼ҵ尡 ���ԵǾ��ִ� Ŭ������ ������ = new Ŭ������();
		Variable01 test = new Variable01();

		//����
		// ������.�޼ҵ��();
		test.declareVariable();
		test.initVariable();
	}

	public void declareVariable() {
		// ������
		// ������
		byte bnum;
		short snum;
		int inum;
		long lnum;

		// �Ǽ���
		float fnum;
		double dnum;

		// ����
		char ch;

		// ��
		boolean isTrue;

		// ������(������)
		String schar;

		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;

		fnum = 4.0f;
		dnum = 8.0;

		ch = 'a';
		schar = "Hello";

		isTrue = true;

		// ������ ����� �� ����ϱ�
		System.out.println("bnum�� ��: " + bnum);
		System.out.println("snum�� ��: " + snum);
		System.out.println("inum�� ��: " + inum);
		System.out.println("lnum�� ��: " + lnum);
		System.out.println("fnum�� ��: " + fnum);
		System.out.println("dnum�� ��: " + dnum);
		System.out.println("ch�� ��: " + ch);
		System.out.println("schar�� ��: " + schar);
		System.out.println("isTrue�� �� :" + isTrue);

	}

	public void initVariable() {
		// ����� ���ÿ� �ʱ�ȭ

		int inum = 4;
		double dnum = 8.0;
		char ch = 'a';
		String schar = "Hello";
		boolean isTrue = true;
		System.out.println();
		System.out.println("inum�� �� :" + inum);
		System.out.println("dnum�� �� :" + dnum);
		System.out.println("ch�� �� :" + ch);
		System.out.println("schar�� �� :" + schar);
		System.out.println("isTrue�� �� :" + isTrue);
	}
}
