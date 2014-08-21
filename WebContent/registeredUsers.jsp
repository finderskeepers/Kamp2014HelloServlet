<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Registered Users,</h1>

<c:if test="${isAuthorized}">

   <ul>
   
	<c:forEach items="${userList}" var="user">
	    <li> <c:out value="${user.name}"/> </li>
	</c:forEach>
   
   </ul>
</c:if>

<c:if test="${not isAuthorized}">
   <p>You have to login first!<p>
</c:if>