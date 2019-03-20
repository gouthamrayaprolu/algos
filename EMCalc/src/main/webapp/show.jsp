<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emi split</title>
</head>
<body>
<c:out value="Hello"></c:out>
<h3>EMI Details</h3>
<hr size="4" color="gray"/>
<table>
    <c:forEach items="${models}" var="model">
        <tr>
            <td>SrNo: <c:out value="${model.eid}"/></td>
            <td>Month: <c:out value="${model.month}"/></td>
            <td>Interest: <c:out value="${model.interest}"/></td>  
            <td>Principal: <c:out value="${model.principal}"/></td>  
            <td>EMI: <c:out value="${model.emi}"/></td>  
            <td>Total Balance: <c:out value="${model.balance}"/></td>  
              
        </tr>
    </c:forEach>
</table>
</body>
</html>