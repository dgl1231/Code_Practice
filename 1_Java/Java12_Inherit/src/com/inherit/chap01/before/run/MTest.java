package com.inherit.chap01.before.run;

import java.util.Date;

import com.inherit.chap01.before.model.dto.Desktop;
import com.inherit.chap01.before.model.dto.SmartPhone;
import com.inherit.chap01.before.model.dto.Television;

public class MTest {

	public static void main(String[] args) {

	Desktop d=new Desktop("����","01","m-01234","���̸�","m1",500,32,"macOS",300,new Date(),true);
		
		SmartPhone s=new SmartPhone("�Ｚ","02","s-4321","������","����",100,16,"android",120,new Date(),"kt");
		
		Television t=new Television("LG","03","t-22334","LGTV",400,new Date(), 65);
		
		d.information();
		s.information();
		t.information();
	}

}
