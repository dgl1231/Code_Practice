package com.test01;

import java.util.Scanner;

public class Operator06 {
	//���׿�����
	//(���ǽ�)? ���϶� : �����϶�
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("���� �ϳ� �Է�");
		int num =input.nextInt();
		
		//num �������, �ƴ��� �Ǵ�
		String str = (num > 0 )?"����� ": (num==0)?"0�̴�":"������";
		System.out.println(str);
	}

}
