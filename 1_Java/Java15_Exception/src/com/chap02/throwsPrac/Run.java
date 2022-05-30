package com.chap02.throwsPrac;

import java.io.IOException;

public class Run {
	//������ ����ó���� ������ �ѱ�� JVM�� �˾Ƽ� ó���ع��� 
	public static void main(String[] args) throws IOException{
		try {
			methodA();
		} catch (IOException e) {
			System.out.println("Main()���� ó��");
		}
	}
	
	public static void methodA() throws IOException{
		methodB();
		
	}
	public static void methodB() throws IOException{
		
		methodC();
		
	}
	//�߻��ϴ� IOException ����ó���� �ѱ���� throws�� ���ָ� 
	//methodC�� ȣ���� �޼��尡 ó���� �ؾ���.
	public static void methodC() throws  IOException{
		//���ܰ� ����� ���ܿ� ���õ� ��ü�� 
		/*try {
			throw new IOException();
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
		}*/
		
		throw new IOException();
	}
}
