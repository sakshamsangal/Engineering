# Service design pattern

## Imports
```java
import org.springframework.stereotype.Service;
```

## Class
```java
@Service
public class LocationService { }
```


## Field
```java
private final LocationRepository repository;
```

## constructor
```java
public LocationService(LocationRepository repository) {
    this.repository = repository;
}
```

# Service methods

## insert
```java
public Location saveLocation(Location location) {
    return repository.save(location);
}
```

## display
``` java
public Location getLocationById(int id) {
    Optional<Location> optionalLocation = repository.findById(id);
    return optionalLocation.orElse(null);
}

public List<Location> getAllLocations() {
    return repository.findAll();
}
```

## delete
``` java
public void deleteLocation(Location location) {
    repository.delete(location);
}
```

## update
``` java
public void updateLocation(Location location) {
    repository.save(location);
}
```