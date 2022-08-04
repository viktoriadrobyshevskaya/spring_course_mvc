<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details:</h2>

<br>

<form:form action="showDetails_mvc" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br> <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>

    <!-- харкод вариант -->
    <%--    Department <form:select path="department">--%>
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
    <%--    </form:select>--%>

    <!-- вариант со списком внутри класса -->
    Department <form:select path="department">
    <form:options items="${employee.departmentList}"/>
</form:select>
    <br><br>

    <!-- харкод вариант -->
    <%--    Which car do you want? <br><br>--%>
    <%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
    <%--    Mercedes <form:radiobutton path="carBrand" value="Mercedes"/>--%>
    <%--    Reno <form:radiobutton path="carBrand" value="Reno"/>--%>
    <%--    <br><br>--%>

    <!-- вариант со списком внутри класса -->
    Which car do you want? <br><br>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>

    <!-- харкод вариант -->
<%--    Foreign languages <br><br>--%>
<%--    <form:checkbox path="languages" value="English" label="EN"/>--%>
<%--    <form:checkbox path="languages" value="Spanish" label="SP"/>--%>
<%--    <form:checkbox path="languages" value="German" label="DE"/>--%>
<%--    <br><br>--%>

    <!-- вариант со списком внутри класса -->
    Foreign languages <br><br>
    <form:checkboxes path="languages" items="${employee.langList}"/>
    <br><br>

    Phone Number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    <input type="submit" value="OK">

</form:form>

</body>

</html>