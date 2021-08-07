package com.kosa.hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import oracle.jdbc.driver.Message;

@Service
public class EmpService implements IEmpService {
   static {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver"); 
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      
// 	new oracle.jdbc.driver.OracleDriver();
      
//   	 try {
//		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}	 
   }
   

   
   @Override
   public int getEmpCount(int deptid) {
	  Connection con = null; 
      try {
	     con = getConnection(); 
         String sql = "select count(*) from employees where department_id=?";
         PreparedStatement stmt = con.prepareStatement(sql);
         stmt.setInt(1, deptid);
         ResultSet rs = stmt.executeQuery();
         if(rs.next()) {
            return rs.getInt(1);
         }
      }catch(SQLException e) {
         throw new RuntimeException(e);
      }
      return -1;
   }
@Override
	public EmpVO getEmp(int empid) {
		EmpVO emp = new EmpVO();
		Connection con = null;
		String sql = "SELECT * FROM employees WHERE employee_id=?"; // 현업에서 * 쓰지 말 것, 열이름 작성
		try {
			con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, empid);
			ResultSet rs = stmt.executeQuery();
			if(rs.next() ) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getNString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con !=null ) {
				try { con.close(); } catch (SQLException e) {}
			}
		}
		return emp;
	}

@Override
	public List<EmpVO> getAllEmps() {
		List<EmpVO> empList = new ArrayList<EmpVO>();
		String sql = "SELECT * FROM employees";
		Connection con = null;
		try {
			con=getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next() ) {
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getNString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartmentId(rs.getInt("department_id"));
				empList.add(emp);
//				System.out.println(rs.getInt("employee_id"));
//				System.out.println(rs.getString("first_name"));
//				System.out.println(rs.getString("last_name"));
//				System.out.println(rs.getString("email"));
//				System.out.println(rs.getString("phone_number"));
//				System.out.println(rs.getDate("hire_date"));
//				System.out.println(rs.getNString("job_id"));
//				System.out.println(rs.getDouble("salary"));
//				System.out.println(rs.getDouble("commission_pct"));
//				System.out.println(rs.getInt("manager_id"));
//				System.out.println(rs.getInt("department_id"));		
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con !=null ) {
				try { con.close(); } catch (SQLException e) {}
			}
		}
		
	return empList;
}

	@Override
		public String getDepartmentName(int deptid) {
			String sql = "SELECT department_name FROM departments WHERE department_id=?";
			Connection con = null;
			
			try {
				con = getConnection();
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, deptid);
				ResultSet rs = stmt.executeQuery();
				if(rs.next()) {
					String departmentName = rs.getNString("department_name");
					return departmentName;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {if(con != null) try {con.close();} catch (SQLException e) {}	}
			return null;
	}

	@Override
	public List<Map<Integer, String>> getAllDeptId() {
		List<Map<Integer, String>> deptList = new ArrayList<Map<Integer,String>>();
		String sql = "SELECT department_id, department_name FROM departments";
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Map<Integer, String> deptMap = new HashMap<Integer, String>();
				int deptId = rs.getInt("department_id");
				String deptName = rs.getString("department_name");
				deptMap.put(deptId, deptName);
				deptList.add(deptMap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {if(con != null) try {con.close();} catch (SQLException e) {}	}
		return deptList;
	}

	@Override
	public List<Map<String, String>> getAllJobId() {
		List<Map<String, String>> jobList = new ArrayList<Map<String, String>>();
		String sql = "SELECT job_id, job_title FROM jobs";
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Map<String, String> jobMap = new HashMap<String, String>();
				jobMap.put(rs.getString("job_id"), rs.getString("job_title"));
				jobList.add(jobMap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { if(con != null) try {con.close();} catch (SQLException e) {}}		
		return jobList;
	}

	@Override
	public void insertEmp(EmpVO emp) {
		String sql = "insert into employees (employee_id, first_name, last_name,"
				+ "email, phone_number, hire_date, job_id, salary,"
				+ "commission_pct, manager_id, department_id)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement stmt =con.prepareStatement(sql);
			stmt.setInt(1, emp.getEmployeeId());
			stmt.setString(2, emp.getFirstName());
			stmt.setString(3, emp.getLastName());
			stmt.setString(4, emp.getEmail());
			stmt.setString(5, emp.getPhoneNumber());
			stmt.setDate(6, emp.getHireDate());
			stmt.setString(7, emp.getJobId());
			stmt.setDouble(8, emp.getSalary());
			stmt.setDouble(9, emp.getCommissionPct());
			stmt.setInt(10, emp.getManagerId());
			stmt.setInt(11, emp.getDepartmentId());
			int rowCount = stmt.executeUpdate();
			if (rowCount==1) {
				System.out.println("입력되었습니다.");
			} else {
				System.out.println("입력에 실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { if(con != null) try {con.close();} catch (SQLException e) {}}
		
	}
	
	@Override
	public void updateEmp(EmpVO emp) {
		String sql = "update employees set first_name=?, salary=? " +
					 "where employee_id=?";
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setNString(1, emp.getFirstName());
			stmt.setDouble(2, emp.getSalary());
			stmt.setInt(3, emp.getEmployeeId());
			int rowCount = stmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println(rowCount + "개 행이 수정되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { if(con != null) try {con.close();} catch (SQLException e){}}
	}
	
	public Connection getConnection() {
	   String url = "jdbc:oracle:thin:@localhost:1521:xe";
	   String id = "hr";
	   String pw = "hr";
	   Connection con = null;
	   try {
		   con = DriverManager.getConnection(url, id, pw);
	   } catch (SQLException e) {
		   System.out.println("데이터베이스 연결 실패");
	   }
	   return con;
	}

}