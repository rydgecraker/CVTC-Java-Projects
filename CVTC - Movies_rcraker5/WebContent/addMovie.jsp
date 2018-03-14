<!doctype html>
<%@page import="org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include"%>
<html>
<head>
<title>Java Web Programming: Add New Movie</title>
<meta name="description" content="This is a JSP example that demonstrates how to use a form to add a new Movie to the database.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>

<div class="container">
	<div class="hero-unit">
		<h1>Add Movie</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<form action="AddMovie" method="post">
			<label for="title"><strong>Title:</strong></label>
			<input name="title"><br>
			
			<label for="director"><strong>Director:</strong></label>
			<input name="director"><br>
			
			<label for="length"><strong>Length in Minutes:</strong></label>
			<input name="length"><br>
			
			<input type="submit" value="AddMovie">
		</form>
	</div>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>