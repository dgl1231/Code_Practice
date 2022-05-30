package com.io.fileTest;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("person.txt");
		System.out.println("���ϸ� :"+file.getName());
		System.out.println("������ : "+file.getAbsolutePath());//������
		System.out.println("������ : " +file.getPath()); //�����
		System.out.println("�뷮 : "+file.length());
		System.out.println("�������� : "+file.getParent()); //�������� null�̸� ��ã�ڴ�
		
		try {
			//boolean b=file.createNewFile();//returnŸ�� boolean
			//System.out.println(b);
			boolean b1=file.delete();
			
			System.out.println(b1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
