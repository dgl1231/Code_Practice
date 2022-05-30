package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//tcp���
public class Server {
	public static void main(String[] args) {
		//���� ���� : Ŭ���̾�Ʈ���� ��û�� ����
		ServerSocket serverSocket=null;
		
		//������ �����̵� ���� : Ŭ���̾�Ʈ���� ������ ��ü
		//���ӵ� Ŭ���̾�Ʈ ����
		Socket serviceSocket=null;
		
		//��°�ü
		PrintWriter out=null;
		
		BufferedReader in=null;
		
		//��û�� ��ٸ�
		try {
			serverSocket=new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("Client�� ��ٸ��ϴ�.");
			try {
				//�޾Ƶ帮�鼭 ������ ����ϴ� ������ �����̵�.
				serviceSocket=serverSocket.accept();
				System.out.println("client�� �����߽��ϴ�.");
				
				//client���� ���� ������ ���δ����� ����
				//����Ʈ�� ���ڶ� �ȸ±⶧���� ������Ʈ������ �����ְ� ������.
				in=new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				
				//�߹޾Ҵٶ�� �ٽ� ���� �ְڴ�.
				//output�� ���� ������Ʈ������ �ȸ��� �൵��.
				out=new PrintWriter(serviceSocket.getOutputStream(),true);
				
				String inputLine=null;
				while((inputLine=in.readLine())!=null) {//readLine���� ������ �о��
					//�о�� ������ ���پ� ���
					System.out.println("Ŭ���̾�Ʈ�� ���� �޽��� "+inputLine);
					//printWriter�� read���� print�׳� ���ָ��.
					out.println(inputLine+" �߹޾Ҿ�");
					}
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

