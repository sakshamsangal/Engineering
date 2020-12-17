# Spring boot project
1. test the downloaded project
2. create [Entity]Controller class
3. add @Controller, @RequestMapping dependency
4. create request url for insert[Entity]View
5. create insert[Entity]View request method
   1. send insert[Entity]View view to client(browser)
6. create bootstrap starter
7. divide page into 8:4
8. create form starter


/**
  * this will return a view 
  * uri = insert-location-view
  * verb = get
  * @return String
  */

@GetMapping("insert-location-view") 
public String insertLocationView() {
  return "insertLocationView";
}

/**
  * this will insert object into database
  * uri = insert-location 
  * verb = post 
  * @param location object (this needs to be saved)
  * @param modelmap to add saved object
  * @return saved object
  */

@PostMapping("insert-location") 
public Location {

}
