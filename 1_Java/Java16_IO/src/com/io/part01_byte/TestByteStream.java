package com.io.part01_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {

	// outputStream
	public void fileSave() {

		FileOutputStream fout = null; //�޼ҵ� ��ü���� ����Ҽ��ְ� null�� �׳� �־��ְ� �ʱ⿡ ��������. try���ȿ� ���� finally�� close���� ������ ��������
		try {
			fout = new FileOutputStream("sample.txt");// ��ݽ�Ʈ���ȿ��� �ܺ��ڿ� ���ϻ����� outputStream�̿��� �ܺη� ����ϴ� ��Ʈ��

			fout.write(97); // write �ۼ�
			byte[] bar = { 98, 99, 100, 101, 102, 10 };
			fout.write(bar);
			fout.write(bar, 1, 3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fout.close();// ����� ��Ʈ�� ������ �ݾƾ��� �ڿ��� ��������
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// inputStream
	public void fileOpne() {
		FileInputStream fin = null; //�޼ҵ� ��ü���� ����Ҽ��ְ� null�� �׳� �־��ְ� �ʱ⿡ ��������. try���ȿ� ���� finally�� close���� ������ ��������

		try {
			fin = new FileInputStream("sample.txt"); // ��ݽ�Ʈ�� �����ھȿ��� �ܺ��ڿ�
			
			//1
			/*int fileSize = (int) new File("sample.txt").length(); // sample.txt����Ʈ ���� ����

			byte[] bar = new byte[fileSize];// ����Ʈ ���� ���� �� ��ŭ bar�迭�� ��´�.
			fin.read(bar);
			for (int i = 0; i < bar.length; i++) {
				System.out.print((char)bar[i] + " ");
			}*/
			
			//2
			int val=0; //val=0�� �ؼ� fin.read�� �־�������fin.read()�� �԰� ���ÿ� �������� �Ѿ�� �̻��ϰ� ��µ�. �׷��� �׳� ��������
			while((val=fin.read()) !=-1) {//read�� �����ϴٰ� -1�� return�Ҷ��� ����. �׶��� ���̻� ���� �����Ͱ� ����.
				System.out.print((char)val+" ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		
		try (FileInputStream fin=new FileInputStream("sample.txt")){
			
			int size= (int)new File("sample.txt").length();
			byte[] bar=new byte[size];
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				System.out.println(bar[i]+ " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
