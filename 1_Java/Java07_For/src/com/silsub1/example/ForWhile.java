package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	Scanner input= new Scanner(System.in);
	
	public void printStar1() {
		System.out.println("�����Է�");
		int n =input.nextInt();
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.print(i);
			System.out.println();
		}
	}
	public void printStar2() {
		System.out.println("���ڸ� �Է��ϼ���");
		int n=input.nextInt();
		if(n>0) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			n*=-1;
			for(int i=0;i<n; i++) {
				for(int j=0; j<n-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	public void countputCharacter() {
/*		���ڿ� ���� �Է¹ް�, �� ���� ���� �ϳ��� �Է¹޾�,
		   ���ڿ� �� �ȿ� �Է¹��ڰ� �� �� �����ϴ��� �� ������ �����
		   ��, �����ڸ� �Է¹޵��� ��.
		 - �޼ҵ�� : public void countInputCharacter(){}
			ex>
			���ڿ� �Է� : application
			���� �Է� : p
			���Ե� ���� : 2 ��
			====================
			���ڿ� �Է� : apple_test123
			�����ڰ� �ƴմϴ�.*/

		System.out.println("���ڿ��� �Է��ϼ���");
		String st=input.nextLine();
		
		for(int i=0; i<st.length();i++) {
			char temp =st.charAt(i);
			if(!(temp>='a' && temp<='z')||(temp>='A'&&temp<='Z')) {
				System.out.println("�����ڰ� �ƴմϴ�.");
				return;
			}
		}
		System.out.println("���� �ϳ��� �Է��ϼ���");
		char ch=input.next().charAt(0);
		
		int sum =0;
	
		for(int i=0; i<st.length();i++) {
			if(ch==st.charAt(i)){
				sum++;
			}
		}
		System.out.println("sum : "+sum);
	}
}
