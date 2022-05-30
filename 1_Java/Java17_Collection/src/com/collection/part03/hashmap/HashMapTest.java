package com.collection.part03.hashmap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	// HashMap
	public void testHashMap() {
		HashMap hmap = new HashMap();

		hmap.put("one", new Date());// key,value
		hmap.put(12, "red");
		hmap.put(34.56, 333);

		System.out.println("hmap: " + hmap);

		hmap.put(12, "yellow"); // key���� �ߺ����� �־������ ����⸦ ��.
		System.out.println("hmap: " + hmap);

		hmap.put(11, "yellow");
		hmap.put(9, "nine");
		System.out.println("hmap: " + hmap);

		System.out.println("key 9�� ���� value : " + hmap.get(9)); //�ϳ��� �ۿ� ���� ����.

		hmap.remove(9);
		System.out.println("hmap: " + hmap);

		System.out.println("����� ��ü �� : " + hmap.size()); // count

	}
	//�ѹ��� �� ���� �ϴ� ���
	public void testHashMap2() {
		HashMap hmap=new HashMap();
		hmap.put("one", "variable");
		hmap.put("two","Operator");
		hmap.put("three", "if");
		hmap.put("four","switch");
		hmap.put("five", "while");
		System.out.println(hmap);
		
		//1.keySet(): key�� ���� Set���� �����.
		Set keys=hmap.keySet();
		Iterator keyIter=keys.iterator();
		
		while(keyIter.hasNext()) {//boolean���� 
			String key=(String)keyIter.next();//Ű���� �������� �������� �Ѿ.
			String value=(String)hmap.get(key);
			System.out.println(key+":"+value);
	
		}
		System.out.println("============");
		//2.entryset(): entry�� ���� set���� �����.
		Set set=hmap.entrySet();
		
		Iterator entryIter=set.iterator();
		
		while(entryIter.hasNext()) {//map��ü�� entry�������� ó������ 
			Map.Entry entry=(Map.Entry)entryIter.next();//next�� return���� obj�� ����ȣ���ؾ���.
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//3. values(): Collection
		Collection values=hmap.values();
		System.out.println("============3-1==========");
		//3-1. Iterator
		Iterator valueIter=values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		System.out.println("============3-2==========");
		//3-2. toArray()
		Object[] vArr=values.toArray();
		for(int i=0;i< vArr.length;i++) {
			System.out.println(i+":"+vArr[i]);
		}
	}
}
