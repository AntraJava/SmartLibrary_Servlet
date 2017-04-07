<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SmartLibrary - Cart - Checkout</title>
</head>
<body>
<Strong>This is your shopping cart</Strong></br>
</br></br>

	<table width="80%">
		<tr>
			<td width="20%">Title</td>
			<td width="20%">Author</td>
			<td width="20%">ISBN</td>
			<td width="10%">Price*Quantity</td>
		</tr>
		<c:forEach items="${shoppingCart.bookAdded}" var="bookEntry">
			<tr>
				<td>${bookEntry.key.title}</td>
				<td>${bookEntry.key.author}</td>
				<td>${bookEntry.key.isbn}</td>
				<td>${bookEntry.key.price} * ${bookEntry.value}</td>
				
			</tr>
		</c:forEach>
	</table>
<p style="margin-top: 20px">	The total is <fmt:formatNumber type="CURRENCY">${shoppingCart.totalPrice}</fmt:formatNumber>.</p>

</br>
<a href="hi2" style="margin-top: 10px">Cancel</a>
<a href="placeOrder">Place Order</a>
</div>
</body>
</html>