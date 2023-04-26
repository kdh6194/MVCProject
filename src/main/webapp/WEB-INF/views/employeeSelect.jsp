<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 조회</title>
</head>
<body>
    <h1>사원 조회</h1>
    <c:forEach items="${emp}" var="e">
        <p> 사원 번호 : ${e.empno} 성 : ${e.fname} 이름 : ${e.lname} 이메일 : ${e.email} 담당 부서 번호 : ${e.deptno}</p>
    </c:forEach>
</form>
</body>
</html>
