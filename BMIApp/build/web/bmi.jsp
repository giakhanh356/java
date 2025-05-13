<%-- 
    Document   : bmi.jsp
    Created on : May 13, 2025, 10:37:51 AM
    Author     : DELL
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Tính BMI</title></head>
<body>
    <h2>Tính chỉ số BMI</h2>
    <form action="bmi" method="post">
        Cân nặng (kg): <input type="text" name="weight" /><br/>
        Chiều cao (m): <input type="text" name="height" /><br/>
        <input type="submit" value="Tính BMI" />
    </form>

    <c:if test="${not empty bmi}">
        <h3>Kết quả BMI: <c:out value="${bmi}" /></h3>
        <c:choose>
            <c:when test="${bmi lt 18.5}">Bạn gầy.</c:when>
            <c:when test="${bmi le 24.9}">Bạn bình thường.</c:when>
            <c:otherwise>Bạn thừa cân.</c:otherwise>
        </c:choose>
    </c:if>
</body>
</html>
