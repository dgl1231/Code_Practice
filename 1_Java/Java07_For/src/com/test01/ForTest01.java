package com.test01;

import java.util.Random;
import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testFor();
//		testFor2();
//		testFor3();
//		testFor4();
//		testFor5();
		testFor6();

	}

	public static void testFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void testFor2() {
		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
			if (i % 10 == 1)
				System.out.println();

		}
	}

	public static void testFor3() {
		int i = 1;
		for (;;) {
			System.out.println(i + " ");
			i++;

			if (i < 10) {
				break;
			}
		}
	}

	public static void testFor4() {

		Scanner input = new Scanner(System.in);
		System.out.println("�������� 1~9 ���̰��� �Է��ϼ���");
		int num = input.nextInt();
		if (num > 0 && num < 10) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", num, i, num * i);
			}
		} else {
			System.out.println("���ڰ� Ʋ�Ƚ��ϴ�.");
		}
	}

	public static void testFor5() {
		int num = (int) (Math.random() * 100) + 1; //+1�� ������� 1~100
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("������ �� : " + num + " ������ �� :" + sum);
	}
	public static void testFor6() {
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int max =input.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int min=input.nextInt();
		int sum=0;
		
		if(max<min) {
			int temp;
			temp =max;
			max=min;
			min=temp;
		}
		for(int i=min;i<=max ;i++) {
			 sum +=i;
			
		}
		System.out.println("������ : "+ min +"���� ū�� : "+max +"���� ���� ���� :"+sum);
		
	}
}
