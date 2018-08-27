<%-- 
    Document   : login
    Created on : Aug 27, 2018, 10:24:15 AM
    Author     : SWASTIK_SHRESTHA
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page !</title>
    </head>
    <body onload='document.loginFrom.username.focus();'>
        <h1>Login Form</h1>
        
        <c:if test="${not empty errorMessge}"><div style="color:red; font-weight: bold; margin: 30px 0px;">${errorMessge}</div></c:if>
        
        <form name="login" action="/login" method="POST">
            <table>
                <tr>
                    <td>UserName:</td>
                    <td><input type="text" name="username" value=''/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input name="submit" type="submit" value="submit"/></td>
                </tr>
            </table>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </body>
</html>
