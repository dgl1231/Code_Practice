package com.test.chap03.test02;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitBlock p=new InitBlock("ȫ��5",100,"������");
		p.information();
		
		p.setName("ȫ��6");
		String pName=p.getName();
		System.out.println("pName: "+pName);
	}

}
