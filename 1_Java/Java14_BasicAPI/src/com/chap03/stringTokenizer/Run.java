package com.chap03.stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	//countToken :��ū �� �ľ�
	//nextToken : ��ū �о����
	//hasMoreToken :��ū�� �����ִ��� Ȯ��, boolean
	public static void main(String[] args) {
		String str="���ѽ�,22,���� ���Ǳ�,��";
		StringTokenizer st=new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		//������ ��ū �ִ��� Ȯ���ϰ� ������ true, ������ false
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
