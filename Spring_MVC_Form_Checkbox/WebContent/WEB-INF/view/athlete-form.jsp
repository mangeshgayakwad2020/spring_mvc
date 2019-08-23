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