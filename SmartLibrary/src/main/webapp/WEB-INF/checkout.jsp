<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SmartLibrary</title>
</head>
<body style="text-align: center;">
<Strong>This is your shopping cart</Strong><br>

<Strong>Hello, ${user.userName}</Strong> <br>
<a href="/SmartLibrary/logout">logout</a>

<br><br>

	<table align="center">
		<tr>
			<td width="20%">Title</td>
			<td width="20%">Author</td>
			<td width="20%">ISBN</td>
			<td width="20%">Price*Quantity</td>
		</tr>
		<c:forEach items="${shoppingCart.bookAdded}" var="bookEntry">
			<form action="/SmartLibrary/updateCart" method="post" id="form_${bookEntry.key.isbn}">
				<input type="hidden" value="${bookEntry.key.isbn}" name="isbn"/>
			<tr>
				<td>${bookEntry.key.title}</td>
				<td>${bookEntry.key.author}</td>
				<td>${bookEntry.key.isbn}</td>
				<td>${bookEntry.key.price} * <input value="${bookEntry.value}" style="width:20px" name="newValue_${bookEntry.key.isbn}"><button form="form_${bookEntry.key.isbn}">Update</button></td>
			</tr>
			</form>
		</c:forEach>
	</table>
<p style="margin-top: 20px">The total is <fmt:formatNumber type="CURRENCY">${shoppingCart.totalPrice}</fmt:formatNumber>.</p>

<br>

<a href="main" style="margin-top: 10px">Cancel</a><br>
<a href="placeOrder">Place Order</a>
</div>
</body>
</html>