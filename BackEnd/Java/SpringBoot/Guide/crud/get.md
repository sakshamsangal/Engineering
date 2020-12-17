```
@GetMapping
public List<Location> getLocations() {
    return locationRepository.findAll();

}


@RequestMapping("/displayLocations")
public String displayLocations(ModelMap modelMap) {
    List<Location> locations = service.getAllLocations();
    modelMap.addAttribute("locations", locations);
    return "displayLocations";
}

// service
public List<Location> getAllLocations() {
    return repository.findAll();
}

@GetMapping("/{id}")
public Location getLocation(@PathVariable("id") int id) {
    Optional<Location> optionalLocation = locationRepository.findById(id);
    return optionalLocation.orElse(null);
}

public Location getLocationById(int id) {
    Optional<Location> optionalLocation = repository.findById(id);
    return optionalLocation.orElse(null);
}

```