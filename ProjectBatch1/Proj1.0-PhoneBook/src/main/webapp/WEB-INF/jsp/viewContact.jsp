<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="black">
    <font face = "Comic sans MS" color="green" size=6>${sMsg}</font><br><br>
    <font face = "Comic sans MS" color="red" size=6>${sMsg1}</font><br><br>
<form:form action="saveContact" method="Post" modelAttribute="contact" align="center">
  <table border = "1" bordercolor="red" bgcolor="yellow" width = "600" height = "400" align="center" >
   <thead>
            <tr>
               <td colspan = "4" align="center"><b><font color="red">Contact Details</font></b></td>
            </tr>
         </thead>
           <tr>
    <td>Contact Name:</td>
    <td><form:input path="contactName"/></td>
  </tr>
  <tr>
    <td>Contact Email:</td>
    <td><form:input path="contactEmail"/></td>
  </tr>
  <tr>
    <td>Phone Number:</td>
    <td><form:input path="phNo"/></td>
  </tr>
  <tr>
    <td><input type="submit" value="submit"></td>
    <td><input type="reset" value="reset"></td>
  </tr>
  </table>
</form:form>



</body>
</html>