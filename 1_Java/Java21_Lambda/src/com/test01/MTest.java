package com.test01;
//�͸����� ������ٴ°��� ��ȸ���� �ѹ����� �Ⱦ�
public class MTest {
	public static void main(String[] args) {
		Test01 test01_1=()->{System.out.println("test01");};
		test01_1.prn();
		Test01 test01_2=()-> System.out.println("test01");
		test01_2.prn();
		
		//(parameter) ->code;
		Test02 test02_1=(int n)->{System.out.println("intput : "+n);};
		test02_1.prn(1);
		
		Test02 test02_2=(n)-> System.out.println("input2 : "+n);
		test02_2.prn(2);
		Test02 test02_3=n->System.out.println("input3 : "+n);
		test02_3.prn(3);
		
		//(parameter)-> code; (return ��������)
		Test03 test03=(n)->n+n;//n+n�� return��.
		System.out.println(test03.prn(1));
		
		//(parameter,parameter) ->{codes; return val;}(return �����Ұ�)
		Test04 test04=(i,j)->{
			System.out.println("input: "+i+" and "+j);
			return i*j;
		};
		System.out.println(test04.prn(10, 3));
	}
}
