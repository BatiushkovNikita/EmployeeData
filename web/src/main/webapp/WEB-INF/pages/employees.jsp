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
        <div class="col-md-12">
            <h2>Employee Data Manager</h2>
        </div>
    </div>
</div>
</header>

<section>
<div class="container">
    <div class="row">
        <div class="col-md-3">
            <div class="panel panel-default">

                <div class="panel-heading"><h4>New employee</h4></div>
                <div class="panel-body">
                    <c:url value="/addEmployee" var="addEmployee"/>
                    <form:form modelAttribute="employeeParam" action="${addEmployee}" method="post" onsubmit="validateForm(event)">
                        <div class="form-group">
                            <label class="control-label" for="firstName">First name</label>
                            <form:input placeholder="First name" path="firstName" cssClass="form-control" id="firstName" />
                            <p id="firstNameError" style="color: red"></p>
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="lastName">Last name</label>
                            <form:input placeholder="Last name" path="lastName" cssClass="form-control" id="lastName" />
                            <p id="lastNameError" style="color: red"></p>
                        </div>

                        <div class="form-group">
                            <label class="control-label" for="position">Position</label>
                            <form:select path="positionId" items="${positionsParam}" itemLabel="name" itemValue="id"
                                         cssClass="form-control" id="position"/>
                        </div>

                        <div class="form-group">
                            <label class="control-label" for="department">Department</label>
                            <form:select path="departmentId" items="${departmentsParam}" itemLabel="name" itemValue="id"
                                         cssClass="form-control" id="department"/>
                        </div>

                        <div class="form-group">
                            <button class="btn btn-success" type="submit">Add</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>

        <div class="col-md-9">
            <div class="panel panel-default">
                <div class="panel-heading"><h4>All employees</h4></div>
                <div class="panel-body">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>
                                <a href="#" onclick="sortColumn('firstName')">
                                    <span class="glyphicon glyphicon-sort"></span>
                                </a>
                                First Name
                            </th>
                            <th>
                                <a href="#" onclick="sortColumn('lastName')">
                                    <span class="glyphicon glyphicon-sort"></span>
                                </a>
                                Last Name
                            </th>
                            <th>Position</th>
                            <th>Department</th>
                            <th>Options</th>
                        </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${employeesParam}" var="employee">
                                <tr>
                                    <td id="firstNameColumn">${employee.firstName}</td>
                                    <td id="lastNameColumn">${employee.lastName}</td>
                                    <td>${employee.positionName}</td>
                                    <td>${employee.departmentName}</td>
                                    <td>
                                        <spring:url value="{employeeId}/delete" var="deleteEmployeeUrl">
                                            <spring:param name="employeeId" value="${employee.id}" />
                                        </spring:url>
                                        <a href="${fn:escapeXml(deleteEmployeeUrl)}" class="btn btn-danger btn-sm">Delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</section>

</body>
</html>