## download the project java 8 war and no dependency
https://start.spring.io/

## make root = error and banner = off
```
spring.main.banner-mode=off
logging.level.root=ERROR
```

## test the code 
```
// test the code
System.out.println("hello");
```

## get insert view 
```
@GetMapping("/insert-location-view")
public String insertLocationPage() {
    return "insertLocationPage";
}
```

## insert/update data 
```
@PostMapping("/insert-location")
public String insertLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {

    Location locationSaved = service.saveLocation(location);

    modelMap.addAttribute("locationSaved", locationSaved);

    // email sending
    // email.sendEmail("sakshamsangal111@gmail.com", "Location saved", "Hi, Location saved");

    return "insertLocationView";

}
```

# show all data view
```
@GetMapping("/displayLocationsPage")
public String displayLocationsPage(ModelMap modelMap) {

    List<Location> locations = service.getAllLocations();
    
    modelMap.addAttribute("locations", locations);
    
    return "displayLocationsPage";
}
```

# update view 
```
@RequestMapping("/updateLocationPage")
public String updateLocationPage(@RequestParam("id") int id, ModelMap modelMap) {

    Location location = service.getLocationById(id);
    
    modelMap.addAttribute("location", location);
    
    return "updateLocationPage";
}
```


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



