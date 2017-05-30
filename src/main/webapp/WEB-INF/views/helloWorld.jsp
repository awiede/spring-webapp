<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Hello World!</h1>

<form:form action="answerMyQuestion.action" method="get">
	<p>The answer is: ${answer}</p>
	<input type="submit"  />
</form:form>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js" type="text/javascript"></script>