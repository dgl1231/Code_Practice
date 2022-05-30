package com.chap05.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {
	public static void main(String[] args) {
		//Date
		Date date1=new Date(0L);
		System.out.println(date1);
		
		Date today=new Date();
		System.out.println(today);
		
		//���ϴ� �������� ���
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		System.out.println(sdf.format(today));
		
		System.out.println("=====Ķ����=====");
		//date �����ڿ� �ٸ��� new�� �����ؼ� get���� ����ð��� �޾ƿ;���.
		Calendar calendar=Calendar.getInstance();//����ð�
		System.out.println(calendar);
		calendar.set(2019, 9-1,9);
		
		int year=calendar.get(1);
		int month=calendar.get(Calendar.MONTH)+1;//month�� 1��� +1�������
		int date =calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR);
		int min=calendar.get(Calendar.MINUTE);//static �ʵ�� Calendar
		int sec=calendar.get(Calendar.SECOND);
		System.out.println(year+"�� "+month+"�� "+date+"�� "+hour+":"+min+":"+sec);
		System.out.println(calendar.getTime());//DateŸ�� ��ü�� ��ȯ�ؼ� ��ȯ��.
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf1.format(calendar.getTime()));
		
		Calendar cal=(Calendar)calendar.clone();//objŸ���� ��ü�� ���� �ٵ� ���� �ֳ��ϸ� obj�� �� ���� Ŭ�������� �׷��� ����ȯ��.
		cal.add(Calendar.YEAR, -9);
		cal.add(Calendar.MONTH, -3);
		cal.add(Calendar.DATE,20);
		System.out.println(cal.getTime());
		
		System.out.println("====�׷�����====");
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year: "+gc.get(GregorianCalendar.YEAR));
		System.out.println("month: "+gc.get(Calendar.MONTH));
		System.out.println("date: "+gc.get(5));
		
		System.out.println(gc.isLeapYear(2020));
		
	}
}
