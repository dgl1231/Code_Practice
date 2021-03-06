package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static common.JDBCTemplate.*;

public class JDBCTest04 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		insert();
		
		select();
	}
	
	public static void select() throws ClassNotFoundException, SQLException {
		// MYTEST 테이블로 부터 데이터를 읽어 화면에 출력
		// SELECT 
		
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM MYTEST ";

		String url = "jdbc:mysql://localhost:3306/multi";
		String id = "root";
		String pw = "1234";
				
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,id,pw);
		
		
		pstm = con.prepareStatement(sql);
		
		rs = pstm.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : " 
							+ rs.getString(2) + " : "
							+ rs.getString(3));
		}
		
		rs.close();
		pstm.close();
		con.close();
		
	}
	
	
	public static void insert() throws SQLException {
		// preparedStatement
				Connection con = null;
				PreparedStatement pstm = null;
				
				int no = 0;
				String name = null;
				String nickName = null;
				
				String sql = " INSERT INTO MYTEST VALUES(?, ?, ?) ";
				
				Scanner sc = new Scanner(System.in);
				System.out.print("no: ");
				no = sc.nextInt();
				System.out.print("name: ");
				name = sc.next();
				System.out.print("nickName: ");
				nickName = sc.next();
				
				//
				con = getConnection();
				pstm = con.prepareStatement(sql);
				pstm.setInt(1, no);
				pstm.setString(2, name);
				pstm.setString(3, nickName);
				
				int res = pstm.executeUpdate();
				
				if(res>0) {
					System.out.println("insert 성공");
				}else {
					System.out.println("insert 실패");
				}
				
				Close(pstm);
				Close(con);
				sc.close();
	}
	
	
	
	
	
	
	
	
	
	
}
