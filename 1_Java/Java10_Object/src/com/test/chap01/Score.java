package com.test.chap01;

public class Score {
	private String name="���ѽ�";
	private int kor=90;
	private int eng=82;
	private int math=97;
	
	//������
	public Score() {}
	
	//������ ���� ����ϴ� ���
	public void sum() {
		int sum =kor +eng+math;
		System.out.println("������ : "+sum);
	}
	//����� ���� ����ϴ� ���
	public void avg() {
		double avg=(kor+eng+math)/3;
		System.out.println(name+"�л��� ����� : "+avg);
	}
	//���� ���� ������ ���� ������ ã�� ����ϴ� ���
	public void max() {
		if(kor>eng &&kor>math) {
			System.out.println("������ ���� ���� ������ ���� : " + kor+ "�� �Դϴ�.");
		}else if(eng>kor && eng>math){
			System.out.println("������ ���� ���� ������ : " + eng+ "�� �Դϴ�.");
		}
		else{
			System.out.println("������ ���� ���� ������ : " + math+ "�� �Դϴ�.");
		}
	}
	//�ʵ尪 Ȯ���Ҽ� �ִ� ���
	public void prn() {
		System.out.println(name+" �л��� �������� : "+kor+", ��������: "+eng+", ��������: "+math+" �̴�");
	}
	
}
