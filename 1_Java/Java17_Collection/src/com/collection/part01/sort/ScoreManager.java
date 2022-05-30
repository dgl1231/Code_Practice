package com.collection.part01.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new Score("��â��",99));
		list.add(new Score("�̽���",88));
		list.add(new Score("�ֿ���",95));
		list.add(new Score("�ֹ��",70));
		list.add(new Score("ȣ���",60));
		list.add(new Score("������",50));
		
		System.out.println("list : "+list);
		
		Collections.sort(list);
		System.out.println("list : "+list);
		
		Collections.sort(list,new AscScore()); //sort(������list, ������ �������� ������������);
		System.out.println(list);
		
		Collections.sort(list,new DescScore());
		System.out.println(list);
	}

}
