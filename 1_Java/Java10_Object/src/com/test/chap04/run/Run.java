package com.test.chap04.run;

import java.util.Date;

import com.test.chap04.model.dto.User;

public class Run {

	public static void main(String[] args) {
		//�⺻�����ڷ� ��ü����
		User u1=new User();
		u1.information();
		
		
		//�Ű������ִ� �����ڷ� ��ü ����
		User u2=new User("hanseul","1234","�ѽ�");
		u2.information();
		
		User u3=new User("user3","pass02","�̽���",new Date());
		u3.information();
	}

}
