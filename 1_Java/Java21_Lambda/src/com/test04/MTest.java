package com.test04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MTest {
	//��Ʈ��
	public static void main(String[] args) {
//		createStream();
//		createStream2();
		pipeline();
	}
	//�迭 List�� �̿��Ͽ� ó��
	public static void createStream2() {
		
		//String���� ����� �迭�� stream���� �ٲ㼭 forEach�� ���
		String[] arr=new String[] {"1","2","3","4","5","6"};
		Stream<String> stream01=Arrays.stream(arr);
		stream01.forEach(System.out::println);

		List<String> list01=Arrays.asList(arr);
		list01.forEach(System.out::println);
		
	}
	public static void pipeline() {
		//stream�� �Ѱ��� �����ϴ� ���� �ƴ�, �������� �������������� �Լ����� �ٿ� ���డ��
		//1.����Ʈ����
		//2.��Ʈ������ ����
		//3. ���ͷ� ���� ���ϴ°͸� ����� �Ÿ���.
		//4.����
		//5.����Ʈ�κ�ȯ
		List<String> class504=Arrays.asList("���ѽ�","�ֹ��","�̽���","�ֻ���");
		List<String> s=class504.stream().filter(name->name.contains("��")).sorted().collect(Collectors.toList());
		System.out.println(s);
		//collection-> stream���� ������ ���ͷ� �Ÿ���
		class504.stream().filter(name->name.contains("��")).sorted()
		.map(w->w.replace(w.substring(1, w.length()),"*".repeat(w.length()-1)))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println(class504.stream().filter(name->name.contains("��")).sorted().collect(Collectors.toList()));
	}
	public static void createStream() {
		//builder :��Ʈ���� ���������� ���ϴ� �� ���� �� �ִ�.
		//build()�޼ҵ带 ȣ���Ͽ� ��Ʈ���� ������.
		Stream<String> stream01=Stream.<String>builder().add("���ѽ�").add("�̽���").add("�̹��").build(); //��Ʈ���� ����鼭 �ٷ� �������մ°� builder������
		stream01.forEach(System.out::println);//add�� �߰��ѵ����͸� �ϳ��� println���� system.out�ؼ� ����Ʈ��
		
		//empty :����ִ� ��Ʈ�� ����
		Stream<String> stream02=Stream.empty();
		System.out.println(stream02.toArray().length);
		
		//generate :���� ��밡��(Supplier),
		Stream<Integer> stream03=Stream.generate(()->100).limit(5);
		stream03.forEach(System.out::println);
		
		//iterator: �ʱⰪ�� �ش� ���� �ٷ�� ���ٸ� �̿��ؼ� ��Ʈ���� �� ��Ҹ� �����.
		Stream<Integer> stream04=Stream.iterate(1, (i)->++i).limit(5);//���������ڸ� ����ϸ� �����Ѵ���  ���߿� �����ϱ⶧���� ���������ڸ� ����ؾ���
		stream04.forEach(System.out::println);
		
		//range 
		IntStream range01=IntStream.rangeClosed(1, 5);//range�� 1-4���� rangeClosed�� 1-5���� 
		range01.forEachOrdered((i)->System.out.print(i+" "));
	}
}
