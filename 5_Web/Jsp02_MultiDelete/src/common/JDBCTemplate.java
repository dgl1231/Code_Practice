package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("01. 드라이버 연결");
		} catch (ClassNotFoundException e) {
			System.out.println("01. 드라이버 연결 실패");
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/multi";
		String id="root";
		String pw="1234";
		
		Connection con=null;
		
		try {
			con =DriverManager.getConnection(url,id,pw);
			System.out.println("02. 계정 연결");
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//이렇게 한번에 몰아서 close를 쓸수있음 오버로딩 사용 preparestatement는 statment의 자식이기때문에 다형성 적용해서 따로 안써도됨
	public static void close(Connection con ,Statement stmt,ResultSet rs) {
		try {
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("5. DB종료 오류");
			e.printStackTrace();
		}
	}
	//이렇게 한번에 몰아서 close를 쓸수있음 오버로딩 사용 resultSet은 없는 경우도 있음
	public static void close(Connection con ,Statement stmt) {
		try {
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("5. DB종료 오류");
			e.printStackTrace();
		}
	}
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
