package com.test.chap01;

public class Account {
	//������� ( �� �� )
	private String name ="���ѽ�";
	private String accNo="123-456-7890";
	private String pwd="1234";
	private int bankCode=20;
	private int balance=0;
	
	//������(��ü�� �����ϱ����� �޼����� �ϳ���.) ����Ÿ���� ���� 
	public Account(){}
	//Account ac=new Account(); //Account() <- ��������.
	
	//�Ա�
	public void in(int money) {
		if(money>0) {
			balance+=money;
			System.out.println(name+"���� ���¿�"+money+"���� �Ա� �Ǿ����ϴ�.");
		}else {
			System.out.println("�߸��� �ݾ��� �Է� �Ǿ����ϴ�.");
		}
		
	}
	//���
	public void out(int money) {
		if(money<balance) {
			balance-=money;
			System.out.println(name+"���� ���¿���"+money+"���� ��� �Ǿ����ϴ�.");
		}else {
			System.out.println("����Ϸ��� �ݾ��� �ܾ׺��� Ů�ϴ�.");
		}

	}
	//�ܾ���ȸ
	public void display() {
		int no=0;
		System.out.println(name+"���� ���� �ܾ��� "+balance+"�� �Դϴ�.");
	}
}
