<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<body>

<c:if test="${shoppingCart.totalPrice != 0 }">
Order Placed!
<%-- Your user information : name: ${user.userName}, id :${user.id} --%>
Your Order Number is : ${orderNum}
<p style="margin-top: 20px">The total is <fmt:formatNumber type="CURRENCY">${shoppingCart.totalPrice}</fmt:formatNumber>.</p>
</c:if>


<c:if test="${shoppingCart.totalPrice == 0 }">
No order is placed. Cannot replace the same order.
</c:if>
<a href="/SmartLibrary/main">Continue</a>
</body>
</html>