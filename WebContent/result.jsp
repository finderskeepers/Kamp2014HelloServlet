<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:if test="${message != null}">
   <p>${message}<p>
</c:if>


<c:if test="${success == true}">
   <p>Registration is completed.<p>
</c:if>

<c:if test="${success == false}">
   <p>An error occurred!<p>
</c:if>