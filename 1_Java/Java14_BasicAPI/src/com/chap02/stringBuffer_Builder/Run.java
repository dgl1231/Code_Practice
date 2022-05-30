package com.chap02.stringBuffer_Builder;

public class Run {
	public static void main(String[] args) {
		//Run.method1();
		Run.method2();
	}
	public static void method1() {
		StringBuilder sb=new StringBuilder("Hello World");
		System.out.println(sb);
		
		
		//str�� +=�� �ϸ� �ڿ� �̾ �����°Ծƴ� ���ο� ������ �ȳ��ϼ��� �������ѽ��Դϴٸ� ��ģ ���ο� �ּҰ��� ����
		//string�� �����ϸ� �ּҰ��� ����
		String str="�ȳ��ϼ��� ";
		System.out.println("str ���� : "+str +", �ּ�: "+System.identityHashCode(str));
		str+="���� ���ѽ��Դϴ�.";
		System.out.println("str �߰��� : "+str +", �ּ�: "+System.identityHashCode(str));

		//��Ʈ�� ���۸� �����ص� �ּҰ��� ��ȭ�� ����
		StringBuffer sf=new StringBuffer("��ħ�� ����");
		System.out.println("sf ���� : "+sf+", �ּ� : "+sf.hashCode()+", "+System.identityHashCode(sf));
		sf.append("Ȳ�� ����!");
		System.out.println("sf �߰��� : "+sf+", �ּ� : "+sf.hashCode()+", "+System.identityHashCode(sf));
	}
	public static void method2() {
		StringBuilder sb=new StringBuilder("�� ");
		
		//append
		sb.append("Ŀ�� �Ծ����");
		sb.append("~~").append(" �����~");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		//insert
		sb.insert(2, "���� �� ����");
		System.out.println(sb);
		
		//delete
		sb.delete(1, 9);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
