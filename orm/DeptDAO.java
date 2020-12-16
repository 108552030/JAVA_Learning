package orm;

import java.util.List;

public interface DeptDAO {
	void add(Dept dept );
	void update(Dept dept);
	void delete(int deptno);
	Dept findByDeptno(int deptno);
	List<Dept> getAll();
}
