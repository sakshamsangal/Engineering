```
@RestController
@RequestMapping("/locations")
public class LocationRestController {

    final LocationRepository locationRepository;

    public LocationRestController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
}


@Controller
public class LocationController {

    final LocationRepository locationRepository;
    final LocationService service;
    final Email email;
    final Report report;

    final ServletContext servletContext;
        public LocationController(LocationRepository locationRepository, LocationService service, Email email, Report report, ServletContext servletContext) {
        this.locationRepository = locationRepository;
        this.service = service;
        this.email = email;
        this.report = report;
        this.servletContext = servletContext;
    }

}
```