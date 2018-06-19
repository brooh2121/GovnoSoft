<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Fuck</h1>
<form:form method="post" action="save">
    <table>
        <tr>
            <td><form:input path="id"/></td>
            <td><form:input path="name"/></td>
            <td><form:input path="url"/></td>
            <!--<td><form:input path="hash"/></td>-->
            <!--<td><input type="submit" action="hashgen" value="HASHGEN" /></td>-->
            <td><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form:form>
