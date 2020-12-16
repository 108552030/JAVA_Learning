package orm;

import java.util.List;
import java.util.Scanner;

public class DAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入部門編號");
//		int deptno = sc.nextInt();
//		System.out.println("請輸入部門名稱");
//		String dname = sc.next();
//		System.out.println("請輸入所在地");
//		String loc = sc.next();
//		
//		sc.close();
		
		//建立部門物件，使用SET方法將要新增的資料包裝起來
//		Dept dept = new Dept();
//		dept.setDeptno(deptno);
//		dept.setDname(dname);
//		dept.setLoc(loc);
//		
//		//對資料庫的操作，一律透過DAO物件進行
//		DeptDAO dao = new DeptDAOImpl();
//		dao.add(dept);
		
		//
//		DeptDAO dao = new DeptDAOImpl();
//		Dept dept = dao.findByDeptno(deptno);
//		System.out.println("Deptno = " + dept.getDeptno());
//		System.out.println("Dname = " + dept.getDname());
//		System.out.println("Loc = " + dept.getLoc());
		
		DeptDAO dao = new DeptDAOImpl();
		List<Dept> list = dao.getAll();
		for(Dept dept : list) {
			System.out.println("Deptno = " + dept.getDeptno());
			System.out.println("Dname = " + dept.getDname());
			System.out.println("Loc = " + dept.getLoc());
		}

	}

}
