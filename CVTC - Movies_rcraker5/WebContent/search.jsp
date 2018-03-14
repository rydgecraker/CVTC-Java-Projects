<!doctype html>
<%@page import="org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument.Include"%>
<html>
<head>
<title>Movies: Search</title>
<meta name="description" content="This is a JSP search page for movie titles.">
<%@ include file="includes/styles.jsp" %>
</head>
<body>

<div class="container">
	<div class="hero-unit">
		<h1>Search</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<div class="container">
		<form action="SearchController" method="post">
			<label for="movieTitle"><strong>Search by Movie Title: </strong></label>
			<input name="movieTitle">
			<input type="submit" value="Search!">
		</form>
	</div>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>