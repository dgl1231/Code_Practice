package com.poly.part01.test04;

public class MTest {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.bark();
		a.eat("����");
		
		a=new Dog();
		a.bark();
		a.eat("���ٱ�");
		//�θ�Ŭ�������� bite���� �����ްų�, ������ , �߻�ż��� �ٵ�κ��� �ϼ��ϴ� �׷��κ��� �ƴ�. �׷��� ������ �ȵ�.
		//a.bite();
		//�ٿ�ĳ����  animal �θ� ���� ������ ����ȯ�� ���� �ڽ����׸� �־
		((Dog)a).bite();
		
		a=new Eagle();
		a.bark();
		a.eat("��ѱ�");
		//animailŸ������ ������ ����� �༭ fly�� animal�� ��� ����ȵ�. 
		//a.fly();
		//�ٿ�ĳ���� ������ �����
		((Eagle)a).fly();
	}

}
