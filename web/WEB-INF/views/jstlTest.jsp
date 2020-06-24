<%--
  Created by IntelliJ IDEA.
  User: kim-youngmin
  Date: 2020/06/13
  Time: 12:18 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>로그인페이지</title>
</head>
<body>
        <!--
            private int bno;
            private String title;
            private String content;
            private String writer;
            private Date regdate;
            private String remvstatus;
        -->
        <table>
            <c:forEach var="test" items="${selectList}">
            <tr>
                <td><c:out value="${test.bno}"/></td>
                <td><c:out value="${test.title}"/></td>
                <td><c:out value="${test.content}"/></td>
                <td><c:out value="${test.writer}"/></td>
                <td><c:out value="${test.regdate}"/></td>
            </tr>
            </c:forEach>
        </table>
</body>
</html>
