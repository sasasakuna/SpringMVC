<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Student Grade </title>
</head>
<body>
<c:forEach var="student" items = "${students}">
   <c:out value="${student.name}"/>
   <c:out value="${student.grade}"/><p>
</c:forEach>
</body>
</html>