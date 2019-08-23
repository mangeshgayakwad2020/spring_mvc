<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title> Athlete Registration Form</title>

	<style>
		.error{color:red}	
	</style>
</head>

<body>

	<form:form action="registerAthleteWithValidation" modelAttribute="athlete">
	
		First Name: <form:input path="firstName" />
		
		<br><br>
		
		Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />

		<br><br>
		
		Age (*): <form:input path="age" />
		<form:errors path="age" cssClass="error" />

		<br><br>
		
		Secret Code: <form:input path="secretCode" />
		<form:errors path="secretCode" cssClass="error" />
		
		<br><br>
		
		Game Code: <form:input path="gameCode" />
		<form:errors path="gameCode" cssClass="error" />

		<br><br>
		
		Country : 
		<form:select path="country">
		
			<form:options items="${countryOptions}" />
		
		</form:select>
		
		<br><br>
		
		Favourite Sport :
		
		<form:radiobuttons path="favouriteSport" items="${favouriteSportOptions}" />
		
		<br><br>
		
		Equipments Required :
		
		<form:checkbox path="requiredEquipments" value="T-Shirt" /> T-Shirt
		<form:checkbox path="requiredEquipments" value="Track Pant" /> Track Pant
		<form:checkbox path="requiredEquipments" value="Sports Shoes" /> Sports Shoes
		<form:checkbox path="requiredEquipments" value="Bicycle" /> Bicycle
		<form:checkbox path="requiredEquipments" value="Swimming Costume" /> Swimming Costume
		
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>

</body>

</html>