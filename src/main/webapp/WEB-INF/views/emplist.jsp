<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 정보 조회</title>
</head>
<body>
<table border="1px" width="750px" cellpadding="10px" cellspacing="0">
  <tr><th>사원 번호</th><th>이름</th><th>성</th><th>이메일</th><th>전화 번호</th><th>입사일</th><th>직책</th><th>급여</th><th>수당</th><th>상사 번호</th><th>부서번호</th></tr>
  <tr><td>${emps.empno}</td><td>${emps.fname}</td><td>${emps.lname}</td><td>${emps.email}</td><td>${emps.phone}</td><td>${emps.hdate}</td><td>${emps.jobid}</td><td>${emps.sal}</td><td>${emps.comm}</td><td>${emps.mgrid}</td><td>${emps.deptno}</td></tr>
</table>

<div><a href="/update?empno=${emps.empno}">수정하기</a></div>
<div><a href="/delete?empno=${emps.empno}">삭제하기</a></div>

</body>
</html>
