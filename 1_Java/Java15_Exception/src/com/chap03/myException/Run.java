package com.chap03.myException;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� :");
		int no=input.nextInt();
		
		try {
			checkNum(no);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkNum(int num) throws MyException {
		if(num<10) {
			//���ܹ߻�
			//throw new MyException();
			throw new MyException(num+"��(��) 10���� �������ݾ�!");
		}else {
			System.out.println(num+"�� 10���� ũ�ų� ����.");
		}
	}
}
