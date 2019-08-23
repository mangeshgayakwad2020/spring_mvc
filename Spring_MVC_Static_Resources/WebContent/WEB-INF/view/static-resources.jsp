<!Doctype html>
<html>

<head>
<title> Static Resources </title>

<!-- Load the css file -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Resources/css/spring-mvc-css.css">

<!-- Load the js file -->
<script type="text/javascript" src="${pageContext.request.contextPath}/Resources/js/spring-mvc-js.js"></script>

</head>

<body>

<h1> Welcome to Spring MVC - Static Resources..! </h1>

<hr>

<!-- Display the image here -->
<img alt="athlete" src="${pageContext.request.contextPath}/Resources/images/athlete.jpg" width="50%" height="30%"/>

<br><br>

<!-- Add button to test the js -->
<input type="button" onclick="displayAlert()" value="Display Alert"/>

</body>
</html>