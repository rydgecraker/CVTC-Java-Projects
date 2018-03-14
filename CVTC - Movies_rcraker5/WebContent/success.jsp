<!doctype html>
<%@page import="org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include"%>
<html>
<head>
<title>Java Web Programming: Success</title>
<meta name="description" content="This is a jsp example that demonstrates a success response page for successful actions performed in our apllication.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>

<div class="container">
	<div class="hero-unit">
		<h1>Success</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<p>${message}</p>
	</div>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>