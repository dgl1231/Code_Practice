package com.test02;

public class TestMain {

	public static void main(String[] args) {
		//1.�Է¹��� ���� 5�� ����̸� "5�� ����Դϴ�" �� ���
		new Test().test01(3);
		
		//2. �Է¹��� ���� 2�� ����̸鼭 "2�� 3�� ����Դϴ�"�� �������
		// �ƴϸ� "2�� 3�� ����� �ƴմϴ�."�� �������.
		new Test().test02(11);
		
		//3. �Է¹��� ���ڰ� �ҹ��ڶ�� "�ҹ����Դϴ�. ", "�빮���̸� �빮���Դϴ�. " �� �������.
		//lang ��Ű����  CharacterŬ���� Ȯ��
		new Test().test03('a');
	}

}
