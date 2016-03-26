<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Employee Data</title>
    <%@ include file="include.jsp" %>
</head>
<body>

<header>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                Employee Data
            </div>
        </div>
    </div>
</header>

<section>
    <div class="container">
        <c:url value="/addEmployee" var="addEmployee"/>
        <form:form modelAttribute="employeeParam" action="${addEmployee}" method="post">
            <div class="row">
                <div class="col-md-2 col-md-offset-1">
                    <form:input placeholder="First name" path="firstName" cssClass="form-control"/>
                </div>
                <div class="col-md-2">
                    <form:input placeholder="Last name" path="lastName" cssClass="form-control"/>
                </div>

                <div class="col-md-2">
                    <form:input placeholder="Position" path="position" cssClass="form-control"/>
                </div>
                
                <div class="col-md-2">
                    <form:input placeholder="First name" path="department" cssClass="form-control"/>
                </div>

                <div class="col-md-2">
                    <button class="btn btn-default" type="submit">Add</button>
                </div>
            </div>
        </form:form>
    </div>

    <div class="row">
        <div class="col-md-12">
            <table class="table">
                <thead>
                <tr>
                    <th>
                        <a href="#">
                            <span class="glyphicon glyphicon-sort-by-attributes"></span>
                        </a>
                        First Name
                    </th>
                    <th>
                        <a href="#">
                            <span class="glyphicon glyphicon-sort-by-attributes"></span>
                        </a>
                        Last Name
                    </th>
                    <th>
                        Position
                    </th>
                    <th>
                        Department
                    </th>
                </tr>
                </thead>

                <tbody>
                    <c:forEach items="${employees}" var="employee">
                        <tr>
                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td>${employee.position}</td>
                            <td>${employee.department}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    </div>
</section>

</body>
</html>