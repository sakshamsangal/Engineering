```
@Entity
public class Location {

    @Id
    private int id;
    private String code;
    private String name;
    private String type;
}

User 
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

Passenger
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;

Flight 
    private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;

Reservation 
	private Boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;

AbstractEntity
	private Long id;
```