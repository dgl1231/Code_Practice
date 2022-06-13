package com.test01;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanTest {
	
	private MyClass myClass;
	
	public BeanTest() {
		System.out.println("�⺻������(no-args)");
	}
	
	public BeanTest(Date date) {
		System.out.println("��¥������ (date: "+date+")");
	}
	
	public void setMyClass(MyClass myClass) {
		this.myClass= myClass;
		System.out.println("SetMyClass() ȣ��");
	}
	
	public void setDate(Date date) {
		System.out.println("setDate()ȣ�� :" +date);
	}
	
	public void setNumber(int num) {
		System.out.println("setNumber() ȣ��: "+ num);
	}
	
	public void setArray(String[] arr) {
		System.out.println("setArray() ȣ��");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void setList(List<String> list) {
		System.out.println("setList() ȣ��");
		for(String val: list) {
			System.out.println(val);
		}
	}
	
	public void setSet(Set<String> set) {
		System.out.println("setSet() ȣ��");
		
		for(String val: set) {
			System.out.println(val);
		}
	}
	public void setMap(Map<String,String> map) {
		System.out.println("setMap() ȣ��");
		Collection<String> values=map.values();
		for(String val:values) {
			System.out.println(val);
		}
	}
	public void setScore(List<Score> list) {
		System.out.println("setScores()ȣ��");
		for(Score s: list) {
			System.out.println(s);
		}
	}
}
