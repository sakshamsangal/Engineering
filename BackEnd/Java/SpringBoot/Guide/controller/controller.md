# Controller design pattern


``` java

// create [Entity]Controller class
@Controller
public class AnimalController { 

}

```

``` java
// create request url for insert[Entity]View
@GetMapping("insert-animal-view")
```

## Class
```java
@Controller
public class LocationController { }

```

## Fields
```java
final LocationRepository locationRepository;
final LocationService service;
final Email email;
final Report report;
final ServletContext servletContext;
```

## constructor
```java
public LocationController(LocationRepository locationRepository, LocationService service, Email email, Report report, ServletContext servletContext) {
    this.locationRepository = locationRepository;
    this.service = service;
    this.email = email;
    this.report = report;
    this.servletContext = servletContext;
}
```

# Controller methods

## insert
```java
@RequestMapping("/insertLocationPage")
public String showCreate() {
    return "insertLocation";
}

@RequestMapping("/insertLocation")
public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
    Location locationSaved = service.saveLocation(location);
    String msg = "Location saved with id: " + locationSaved.getId();
    modelMap.addAttribute("msg", msg);

    // email sending
    // email.sendEmail("sakshamsangal111@gmail.com", "Location saved", "Hi, Location saved");
    return "insertLocation";
}

```
## display
```java
@RequestMapping("/displayLocations")
public String displayLocations(ModelMap modelMap) {
    List<Location> locations = service.getAllLocations();
    modelMap.addAttribute("locations", locations);
    return "displayLocations";
}

```

## delete
```java
@RequestMapping("deleteLocation")
public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
    // Location location = service.getLocationById(id);
    Location location = new Location();
    location.setId(id);
    service.deleteLocation(location);
    List<Location> locations = service.getAllLocations();
    modelMap.addAttribute("locations", locations);
    return "displayLocations";
}
```

## update
```java
@RequestMapping("/updateLocationPage")
public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
    Location location = service.getLocationById(id);
    modelMap.addAttribute("location", location);
    return "updateLocation";
}


@RequestMapping("/updateLocation")
public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
    service.updateLocation(location);
    List<Location> locations = service.getAllLocations();
    modelMap.addAttribute("locations", locations);
    return "displayLocations";
}
```

## email
```java
email.sendEmail("sakshamsangal111@gmail.com", "Location saved", "Hi, Location saved");
```

## report
```java
@RequestMapping("/generateReport")
public String generateReport() {
    String path = servletContext.getRealPath("/");
    List<Object[]> data = locationRepository.findTypeAndTypeCount();
    report.generatePieChart(path, data);
    return "report";
}
```
