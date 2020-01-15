<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Educational Details</title>
</head>
<body bgcolor="black">
  <h1 style="color:green;text-align:center">Educational Details </h1>
  
  <form:form>
  
      <table border="8" align="center" bgcolor="lime">
          <tr>
            <td>Highest Degree:</td>
            <td> 
              <form:select path="degree"/>
              <form:option value="NONE">-select-</form:option>
              <form:options items="${degreeList}"/>
            </td>
          </tr>
          <tr>
            <td>University:</td>
            <td> 
              <form:select path="university"/>
              <form:option value="NONE">-select-</form:option>
              <form:options items="${universityList}"/>
            </td>
          </tr>
          <tr>
            <td>Highest Degree:</td>
            <td> 
              <form:select path="year"/>
              <form:option value="NONE">-select-</form:option>
              <form:options items="${yearList}"/>
            </td>
          </tr>
      </table>
      
  </form:form>



</body>
</html>