package com.springdata.Roomreservation;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RoomreservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomreservationApplication.class, args);
	}
	
//	@RestController
//	public class RoomController
//	{
//		@Autowired
//		private RoomRepository roomrepo;
//		
//		@GetMapping("/rooms")
//		public Iterable<Room> getRooms()
//		{
//			return this.roomrepo.findAll();
//		}
//	}
//	
//	@RestController
//	public class GuestController
//	{
//		@Autowired
//		private GuestRepository guestrepo;
//		@GetMapping("/guests")
//		public Iterable<Guest> allguests()
//		{
//			return this.guestrepo.findAll();
//		}
//	}
//	
//	@RestController
//	public class ReservationController
//	{
//		@Autowired
//		private ReservationRepository reservationrepo;
//		
//		@GetMapping("/reservations")
//		public Iterable<Reservation> reservations()
//		{
//			return this.reservationrepo.findAll();
//		}
//	}
}

