<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SmartLibrary</title>
</head>
<body style="text-align: center;">
<Strong>Hello, ${user.userName}</Strong> 

<br>
<a href="/SmartLibrary/logout">logout</a>
<br><br><br>

	<table align="center">
		<tr>
			<td width="20%">Title</td>
			<td width="20%">Author</td>
			<td width="10%">Price</td>
			<td width="20%">ISBN</td>
			<td>Action</td>
		</tr>
		<c:forEach items="${bookList}" var="book">
			<form action="/SmartLibrary/addToCart" method="post" id="form_${book.isbn}">
				<input type="hidden" value="${book.isbn}" name="isbn"/>
			</form>
			<tr>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
				<td>${book.isbn}</td>
				<td><button form="form_${book.isbn}">Add to cart</button></td>
			</tr>
		</c:forEach>
	</table>
	
<div style="margin-top: 100px">
You have ${shoppingCart.size()} items in your cart. <br>
The total is <fmt:formatNumber type="CURRENCY">${shoppingCart.totalPrice}</fmt:formatNumber>.
<br>
<a href="/SmartLibrary/checkout"/>Checkout</a>
<c:if test="${!error}">
<p style="color: red">${error}</p>
</c:if>
</div>
</body>
</html>