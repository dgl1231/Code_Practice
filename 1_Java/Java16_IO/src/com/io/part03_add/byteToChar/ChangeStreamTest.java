package com.io.part03_add.byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeStreamTest {
	public void input() {
		//Buffer Stream�� �����͸� �Ѳ����� �������� ���, �Ѳ����� ���� �� �� �ֵ��� �� �ִ� �ӽ� ������̴�.
		//InputStreamReader�� ����,����Ʈ�� �˾Ƽ� ����,��ȯ ���ִ� ��Ʈ��
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //����(����(���)) system.in�ܼ�â�� ����
		
		try {
			System.out.print("���ڿ� �Է� : ");
			String val=br.readLine();
			
			System.out.println("val : "+val);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void output() {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //system.out��ο� java�� ����
		try {
			bw.write("Java Gooooood~");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
