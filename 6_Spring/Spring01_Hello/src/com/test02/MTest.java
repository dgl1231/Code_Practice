package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		//beans.xml�� �����ص״� bean ��Ƶα�
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/beans.xml"); //bean���� �����
		
		MessageBean bean= (MessageBean)factory.getBean("korean"); //bean���� ��ġ�� korean bean�� ������
		bean.sayHello("������");
		
		bean=(MessageBean)factory.getBean("english");
		bean.sayHello("spring");
	}
}
