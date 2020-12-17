# Controller
```java
@RestController
@RequestMapping("/locations")
public class LocationRestController { } 
```

# Fields
```java
final LocationRepository locationRepository;
```

# constructor
```java
public LocationRestController(LocationRepository locationRepository) {
    this.locationRepository = locationRepository;
}
```

# insert
```java
@PostMapping
public Location createLocation(@RequestBody Location location) {
    return locationRepository.save(location);
}
```
# display
```java
@GetMapping
public List<Location> getLocations() {
    return locationRepository.findAll();
}

@GetMapping("/{id}")
public Location getLocation(@PathVariable("id") int id) {
    Optional<Location> optionalLocation = locationRepository.findById(id);
    return optionalLocation.orElse(null);
}
```

# delete
```java
@DeleteMapping("/{id}")
public void deleteLocation(@PathVariable("id") int id) {
    locationRepository.deleteById(id);
}
```

# update
```java
@PutMapping
public Location updateLocation(@RequestBody Location location) {
    return locationRepository.save(location);

}
```