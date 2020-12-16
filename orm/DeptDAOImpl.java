package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO{

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?"
			+ "useSSL=false&"
			+ "serverTimezone=Asia/Taipei&"
			+ "allowPublicKeyRetrieval=true&"
			+ "useUnicode=true&"
			+ "characterEncoding=utf-8";
	public static final String USER = "David";
	public static final String PASSWORD = "123456";

	public static final String INSERT_STMT = "INSERT INTO DEPARTMENT (DEPTNO, DNAME, LOC) VALUES (?, ?, ?)";
	public static final String FIND_BY_DEPTNO = "SELECT * FROM DEPARTMENT WHERE DEPTNO = ?";
	public static final String GET_ALL = "SELECT * FROM DEPARTMENT ORDER BY DEPTNO";
	
	static {
		try {
			Class.forName(DRIVER);
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
	}
	
	
	
	@Override
	public void add(Dept dept) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			pstmt.executeUpdate();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
				
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}

		}
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int deptno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dept findByDeptno(int deptno) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);
			pstmt.setInt(1,deptno);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//用Dept物件包裝從資料庫取出各個欄位的資料
				dept = new Dept();
				dept.setDeptno(deptno);
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
				
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
				
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
		}
		return dept;
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//用Dept物件包裝從資料庫取出各個欄位的資料
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
				//用集合收集包好資料的部門物件，最後再一次回傳
				deptList.add(dept);
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
				
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
				
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
		}
		return deptList;
	}	
}
