<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
<title> Athlete Registration Form</title>
</head>

<body>

	<form:form action="registerAthlete" modelAttribute="athlete">
	
		First Name: <form:input path="firstName" />
		
		<br><br>
		
		Last Name: <form:input path="lastName" />
		
		<br><br>
		
		Country : 
		<form:select path="country">
		
			<form:options items="${countryOptions}" />
		
		</form:select>
		
		<br><br>
		
		Favourite Sport :
		
		<form:radiobuttons path="favouriteSport" items="${athlete.favouriteSportOptions}" />
		
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>

</body>

</html>