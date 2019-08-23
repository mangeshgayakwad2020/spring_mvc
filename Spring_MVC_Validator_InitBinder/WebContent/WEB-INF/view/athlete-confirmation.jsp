<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
<title> Athlete Registration Confirmation</title>
</head>

<body>

Athlete Registration is successful for : ${athlete.firstName} ${athlete.lastName}

<br><br>

Country : ${athlete.country}

<br><br>

Favourite Sport : ${athlete.favouriteSport}

<br><br>

Equipments required :

<ul>

	<c:forEach var="equipment" items="${athlete.requiredEquipments}" >
	
		<li> ${equipment} </li>
	
	</c:forEach>

</ul>

</body>

</html>