package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		// �迭�� ������ �Է�
		// a~z
		char[] ch = new char[26];
		for (int i = 0; i < 26; i++) {
			ch[i] = (char) ((int) 'a' + i);
		}
		// 1. a~z�� ����ִ� ������ �迭 ���
		new ArrayTest02().prn(ch);
		// 2. �迭�� �Ųٷ� ���
		new ArrayTest02().reverse(ch);
		// 3. �빮�ڷ� �����Ͽ� ���
		new ArrayTest02().upper(ch);
	}

	public void prn(char[] ch) {
		// a b c d e f g ... x y z
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}

	public void reverse(char[] ch) {
		char [] re=new char[ch.length];
		int j=0;
		for (int i = ch.length - 1; i >= 0; i--) {
			re[j]=ch[i];
			j++;
		}
		prn(re);
	}

	public void upper(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			//ch[i]=(char)((int)ch[i]-32); 40���̶� ��������
			ch[i]=Character.toUpperCase(ch[i]);
		}
		prn(ch);
	}
}
