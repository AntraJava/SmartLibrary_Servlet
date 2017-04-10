<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SmartLibrary - Login</title>
</head>
<body style="text-align: center;">
<Strong>Smart Library</Strong><br>

<c:if test="${invalidUser}"><p style="color: red">Incorrect User Name or Password</p></c:if>
    <form action="/SmartLibrary/login" method="post">
    <table align="center">
    	<tr>
    		<td>
    			<label>User Name:</label>
    		</td>
    		<td>
				<input type="text" name="userName" required="required"/>
    		</td>
    	</tr>
    	<tr>
    		<td>
    			<label>Password:</label>
    		</td>
    		<td>
				<input type="password" name="password"/>
    		</td>
    	</tr>
    	<tr>
    		<td>
				<input value="Submit" type="submit"/>
    		</td>
    		<td>
				<input type="reset" value="Reset" />
    		</td>
    	</tr>
    </table>
	</form>
</body>
</html>