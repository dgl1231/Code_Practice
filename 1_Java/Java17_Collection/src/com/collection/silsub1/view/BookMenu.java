package com.collection.silsub1.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.collection.silsub1.controller.BookManager;
import com.collection.silsub1.model.dto.Book;
//view���� �޴��� �Ŵ������׸� ��Ŵ
public class BookMenu {
	private Scanner input= new Scanner(System.in);
	private BookManager bm=new BookManager();
	
	public BookMenu() {}
	public void mainMenu() {
		while(true) {//6,1,5,4,3,2
			System.out.println("***���� ���� ���α׷�");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. �������� ���� �� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� �˻� ���");
			System.out.println("5. ��ü���");
			System.out.println("6. ������");
			
			System.out.print("�޴����� : ");
			int num=input.nextInt();
			input.nextLine();
			switch(num) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());//�����Ѵ��� ���
				break;
			case 3:
				int result=bm.deleteBook(inputBookNo());
				if(result>0) {
					System.out.println("���������� �����Ǿ����ϴ�.");
				}else {
					System.out.println("������ ���� �������� �ʽ��ϴ�.");
				}
				break;
			case 4:
				//å ������� Ȯ��
				int index=bm.searchBook(inputBookTitle());
				if(index==-1) {
					System.out.println("��ȸ�� ������ �������� �ʽ��ϴ�.");
				}else {
					System.out.println(bm.selectBook(index));
				}
				break;
			case 5:
				ArrayList<Book>list=bm.selectAll();
				if(list.isEmpty()) {
					System.out.println("������ �����ϴ�.");
				}else {
					//Iterator�� ���
					Iterator<Book> it=list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					//System.out.println(list);
				}
				break;
			case 6:
				System.out.println("����Ǿ����ϴ�.");
				return;
			}
			
		}
		
	}
	public Book inputBook() {
		System.out.print("���� ����: ");
		String title=input.nextLine();
		System.out.print("\n���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) : ");
		int category=input.nextInt();
		input.nextLine();
		System.out.print("\n���� ����: ");
		String author=input.nextLine();
		return new Book(category,title, author);
	}
	public int inputBookNo() {
		System.out.println("������ȣ: ");
		int no=input.nextInt();
		input.nextLine();
		
		return no;
	}
	public String inputBookTitle() {
		System.out.print("ã�� ���� ����: ");
		String title=input.nextLine();
		return title;
	}
}
