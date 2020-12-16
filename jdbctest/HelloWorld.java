package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloWorld {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?"
			+ "useSSL=false&"
			+ "serverTimezone=Asia/Taipei&"
			+ "useUnicode=true&"
			+ "characterEncoding=utf-8&"
			+ "allowPublicKeyRetrieval=true";
	public static final String USER = "David";
	public static final String PASSWORD = "123456";
	
	public static final String INSERT_SQL = "insert into department (deptno, dname, loc)"
			+ " values(?, ?, ?)";
//	public static final String DELETE_SQL = "delete from department where deptno = 60";
	
	public static final String SQL = "select * from department";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入部門編號");
		int deptno = sc.nextInt();
		System.out.println("請輸入部門名稱");
		String dname = sc.next();
		System.out.println("請輸入所在地");
		String loc = sc.next();
		
		sc.close();
		
		try {
			//step 1:load driver
			Class.forName(DRIVER);	
			System.out.println("載入成功！");
			
			//step 2:Create connection
			con =  DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功！");
			
			//step 3:send SQL 
			pstmt = con.prepareStatement(INSERT_SQL);
			
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(pstmt.getClass());
			
			
//			stmt = con.createStatement();
//			int count = stmt.executeUpdate(SQL);
//			System.out.println(count + "筆資料更新成功！");
			
//			stmt = con.createStatement();
//			rs = stmt.executeQuery(SQL);
//			System.out.printf("DEPTNO");
//			while(rs.next()) {
//				int deptno = rs.getInt("DEPTNO");
//				String dname = rs.getString("DNAME");
//				String loc = rs.getString("LOC");
//				
//				System.out.printf("%d %s %s\n", deptno, dname, loc);
//			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally{
			
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
			
			if(stmt != null) {
				try {
					stmt.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
		}
		
	}

}
