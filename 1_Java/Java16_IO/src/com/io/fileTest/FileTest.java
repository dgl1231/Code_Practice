package com.io.fileTest;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("person.txt");
		System.out.println("파일명 :"+file.getName());
		System.out.println("저장경로 : "+file.getAbsolutePath());//절대경로
		System.out.println("저장경로 : " +file.getPath()); //상대경로
		System.out.println("용량 : "+file.length());
		System.out.println("상위폴더 : "+file.getParent()); //상위폴더 null이면 못찾겠다
		
		try {
			//boolean b=file.createNewFile();//return타입 boolean
			//System.out.println(b);
			boolean b1=file.delete();
			
			System.out.println(b1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
