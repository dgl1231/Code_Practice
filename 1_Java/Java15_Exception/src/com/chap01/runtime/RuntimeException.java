package com.chap01.runtime;

import java.io.IOException;
import java.util.Scanner;

import com.chap02.throwsPrac.Run;

//�ҽ��ڵ�� ����ó���� ������ Runtime Error
public class RuntimeException{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		RuntimeException re = new RuntimeException();
		// re.test1();
		//re.test2();
		re.test3();
	}

	public void test1() {
		int no = 100;

		System.out.print("������ �� �ϳ� �Է�: ");
		int inputNum = sc.nextInt();
//		if(inputNum==0) {
//			System.out.println("0�� �Է��߽��ϴ�.");
//		}else {
//			int res=no/inputNum;
//			System.out.println("������ ���:" +res);
//		

		// try catch ó��
		try {
			int res = no / inputNum;
			System.out.println("������ ���: " + res);
		} catch (ArithmeticException e) { // ������ 0���� ��������
			e.printStackTrace();
			System.out.println("Exception �߻�");
		}
	}

	public void test2() {
		try {
			// ClassCastException -����ȯ�Ҷ� �߸� ����ȭ �������
			/*Object obj = 'a';
			System.out.println(obj);
			String str = (String) obj;
			System.out.println(str);*/
			//ArrayIndexOutOfBoundsException
			/*int arr[]=new int[2];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			System.out.println("�̰� ����ɱ�?");*/
			String str=null;
			int length=str.length();
		} catch (ClassCastException e) {
			System.out.println("���� �߻�! ����ȯ �Ұ�!");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �߻� �迭�� ������ �Ѿ!");
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println("���� �߻� null�ε� ���� ������ؼ�!");
			System.out.println(e.getMessage());
		}finally {
		}
			System.out.println("���ܰ� �߻��ϴ�, ���ϴ� ������ finally�� ������ ������");
		}
	
		public void test3(){
			Run r=new Run();
			try {
				r.methodB();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

