package com.poly.part01.test06;

//Impl�� �����°� ���� ��ӹ޾Ҵ� ��� ��������
public abstract class AreaImpl implements Area{
	private String result;
	
	public void setResult(String result) {
		this.result=result;
	}
	@Override
	public void print() {
		System.out.println(Area.print+result);
	}

	//abstract�� �Ἥ �� Ŭ�������� make�������Ұž� �Ϲ������δ� �ؾ���.
	//��ӹ����� �����ϱ� ������ class�� abstract�� ��� �����Ұ� �佺��
	@Override
	public abstract void make(); 
		

}
