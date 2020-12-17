```
@Entity = class which needs to be mapped with table

@Id = PRIMARY KEY in table 

@GeneratedValue(strategy=GenerationType.IDENTITY) = AUTO_INCREMENT

@MappedSuperclass = no mapping should be done

@RequestParam("username") = get value of form field

@DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate


modelMap.addAttribute("flight", flight) = key, value pair 

@RequestMapping(value = "/completeReservation", method = RequestMethod.POST)

@OneToOne
@ManyToMany(mappedBy = "roles")
@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))

```
