<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Convert Sentences</title>
<style type="text/css">
.error {
	color: #ff000;
}

.errorblock {
	color: #000 background-color:#FFEEEE;
	border: 3px solid #ff000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body>


	<form:form commandName="convert">
	<form:errors path="*" cssClass="errorblock" element="div" />
		<label for="textinput1">Enter A Sentence</label>
		<form:input  path="sentence" cssErrorClass="error" value="This is TEST VALUE"/>
		<form:errors path="sentence" cssClass="error"/>
		<br>
		<input type="submit" class="btn" value="Convert">
		
	</form:form>

</body>
</html>