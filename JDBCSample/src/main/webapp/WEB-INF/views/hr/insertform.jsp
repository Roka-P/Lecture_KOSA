<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원입력 폼</title>
</head>
<body>
<h1>사원정보 입력</h1>
<form action="./insert" method="get">
<table border=1>
	<tr>
		<td>EMPLOYEE_ID</td>
		<td><input type="number" name="employeeId" required></td>
	</tr>
	<tr>
		<td>FIRST_NAME</td>
		<td><input type="text" name="firstName"></td>
	</tr>
	<tr>
		<td>LAST_NAME</td>
		<td><input type="text" name="lastName" required></td>
	</tr>
	<tr>
		<td>EMAIL</td>
		<td><input type="text" name="email" required></td>
	</tr>
	<tr>
		<td>PHONE_NUMBER</td>
		<td><input type="text" name="phoneNumber"></td>
	</tr>
	<tr>
		<td>HIRE_DATE</td>
		<td><input type="date" name="hireDate" required></td>
	</tr>
	<tr>
		<td>JOB_ID</td>
		<td>
		<select id="jobId">
			<c:forEach var="job" items="${jobList}">
				<option value="${job.jobId}">${job.title}</option>
			</c:forEach>
		</select>
		</td>
	</tr>
	<tr>
		<td>SALARY</td>
		<td><input type="number" name="salary"></td>
	</tr>
	<tr>
		<td>COMMISSION_PCT</td>
		<td><input type="number" name="commissionPct" step="0.1" min="0" max="0.99"></td>
	</tr>
	<tr>
		<td>MANAGER_ID</td>
		<td>
		<select name="managerId">
			<c:forEach var="manager" items="${managerList}">
				<option value="${manager.managerId}">${manager.firstName}</option>
			</c:forEach>
		</select>
		</td>
	</tr>
		<tr>
		<td>DEPARTMENT_ID</td>
		<td>
		<select name="departmentId">
			<c:forEach var="department" items="${deptList}">
				<option value="${department.departmentId}">${department.departmentName}</option>
			</c:forEach>
		</select>
		</td>
	</tr>
	<tr>
		<th>&nbsp;</th>
		<td>
			<input type="submit" value="저장">
			<input type="reset" value="취소">
		</td>
	</tr>
</table>						
</form>
</body>
</html>