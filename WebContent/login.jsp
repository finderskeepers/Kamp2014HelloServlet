<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form action="login" method="post">
	<input type="text" name="username" placeholder="username"> <br>
	<input type="password" name="password" placeholder="password"> <br>
	<button type="submit">Login</button>
</form>

<c:if test="${message != null}">
   <p>${message}<p>
</c:if>