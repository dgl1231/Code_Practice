package com.inherit.chap01.after.model.dto;

import java.util.Date;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Desktop extends Computer{
	private boolean allInOne;
	
	
	//������
	public Desktop() {}


	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInOne) {
		//coputer�� �Ű����������ڷ� �Ѿ�� �ڱⰡ ó���Ұ� �ϰ� �θ�� �Ѱ��ٰ� �Ѱ���
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os); 
		this.allInOne = allInOne;
	}
	
	//getter & setter
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	//information
	@Override
	public String information() {
		return super.information()+", "+this.allInOne;//this.allInOne == allInOne
	}
}
