package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		int[] arr=new int[3];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		/*	Book bk1=new Book("�̰��� �ڹٴ�","�ſ��","�Ѻ��̵��",30000);
		Book bk2=new Book("HTML5 �� ���α׷��� �Թ�","���μ�","�Ѻ���ī����",26000);
		Book bk3=new Book("�ڹ� ���� �ٷ�� ���","�̺���","���",35000);
	
		Book[] bk=new Book[3];
		bk[0]=new Book("�̰��� �ڹٴ�","�ſ��","�Ѻ��̵��",30000);
		bk[1]=new Book("HTML5 �� ���α׷��� �Թ�","���μ�","�Ѻ���ī����",26000);
		bk[2]=new Book("�ڹ� ���� �ٷ�� ���","�̺���","���",35000);
	*/
		Book[] bk= {
				new Book("�̰��� �ڹٴ�","�ſ��","�Ѻ��̵��",30000),
				new Book("HTML5 �� ���α׷��� �Թ�","���μ�","�Ѻ���ī����",26000),
				new Book("�ڹ� ���� �ٷ�� ���","�̺���","���",35000)
		};
		
		/*System.out.println(bk);					//Book[] �迭�� �ּҰ� stack
		System.out.println(bk[0]);				//Book ��ü�� �ּ� heap
		System.out.println(bk[0].getPrice());	//���� �ȿ��ִ� ������ heap */
		
		Scanner input=new Scanner(System.in);
		System.out.println("�˻��� å ���� : ");
		String searchTitle=input.nextLine();
		
		
		for(int i=0; i<bk.length;i++) {
			if(bk[i].getTitle().equals(searchTitle)) {
				System.out.println(bk[i].information());
			}
		}
	}

}
