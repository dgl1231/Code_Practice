package com.collection.part02.hashSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public void testHashSet() {
		//HashSet
		//set�� ���� �ϳ��� ���ü����� ������ ��� 
		//�̾ƿ����� iterator����ؾ���.
		HashSet hset=new HashSet();
		hset.add("Java");
		hset.add(123);
		hset.add(45.67);
		hset.add(new Date());
		
		System.out.println("hset: "+hset);
		
		hset.add("Java");
		hset.add(123);
		System.out.println("hset: "+hset);
		System.out.println("����� ��ü�� : "+hset.size());
		
		//1. toArray();
		Object[] arr=hset.toArray();
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
		}
		System.out.println("=========");
		//2.Iterator();
		Iterator iter=hset.iterator();//���ٷ� �ٻ���
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//hset.remove("java")//�ϳ��� ����
		hset.clear();//�ѹ��� �ϴ� ����
		System.out.println(hset);
		
		hset.add(new Score("���ѽ�",100,90));
		hset.add(new Score("�ֿ���",100,80));
		hset.add(new Score("�ֹ��",70,80));
		hset.add(new Score("�̽���",80,70));
		System.out.println(hset);
		System.out.println("���� : "+hset.size());
		//new�� ��ü�� ���� ������� ������ �ߺ������� �ٸ��� �Ǻ��Ͽ� �߰���
		//�׷��� scoreŬ�������� hashCode�� equlas�� �߰��ؾ���.
		hset.add(new Score("�̽���",80,70)); 
		System.out.println(hset);
		System.out.println("�߰� �� ���� : "+hset.size());
	}
}
