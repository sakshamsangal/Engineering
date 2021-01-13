```
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
```


```
<c:forEach items="${locations}" var="location">
    <tr>
        <td>${location.id}</td>
        <td>${location.code}</td>
        <td>${location.name}</td>
        <td>${location.type}</td>
        <td><a class="btn btn-danger btn-sm" href="deleteLocation?id=${location.id}">delete</a></td>
        <td><a class="btn btn-info btn-sm" href="updateLocationPage?id=${location.id}">edit</a></td>
    </tr>
</c:forEach>
```


```
spring.datasource.url=jdbc:mysql://localhost:3306/projectdb
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.show-sql=true

spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```


 <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>



