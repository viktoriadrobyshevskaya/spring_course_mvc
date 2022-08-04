<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear ${employee.name}, you are WELCOME!</h2>

<br>

<h4> Your name: ${employee.name} </h4>
<h4> Your surname: ${employee.surname} </h4>
<h4> Your salary: ${employee.salary} </h4>
<h4> Your department: ${employee.department} </h4>
<h4> Your Car: ${employee.carBrand} </h4>
<h4> Language(s):
        <ul>
            <c:forEach var="lang" items="${employee.languages}">

                <li> ${lang}</li>

            </c:forEach>
        </ul>
</h4>
<h4> Your phone number: ${employee.phoneNumber} </h4>
<h4> Your email: ${employee.email} </h4>
</body>

</html>