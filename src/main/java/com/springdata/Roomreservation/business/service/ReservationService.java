package com.springdata.Roomreservation.business.service;



import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springdata.Roomreservation.business.domain.RoomReservation;
import com.springdata.Roomreservation.data.entity.Guest;
import com.springdata.Roomreservation.data.entity.Reservation;
import com.springdata.Roomreservation.data.entity.Room;
import com.springdata.Roomreservation.data.repository.GuestRepository;
import com.springdata.Roomreservation.data.repository.ReservationRepository;
import com.springdata.Roomreservation.data.repository.RoomRepository;

@Service
public class ReservationService {
	

	private RoomRepository roomrepo;
	private GuestRepository guestrepo;
	private ReservationRepository reservationrepo;
	public ReservationService(RoomRepository roomrepo, GuestRepository guestrepo,
			ReservationRepository reservationrepo) {
		super();
		this.roomrepo = roomrepo;
		this.guestrepo = guestrepo;
		this.reservationrepo = reservationrepo;
	}
	
	public List<RoomReservation> getRoomReservationsfromdate(java.util.Date date)
	{
		Iterable<Room> rooms=this.roomrepo.findAll();
		Map<Long,RoomReservation> roomreservationmap=new HashMap<>();
		rooms.forEach(room->
		{
		RoomReservation roomreservation=new RoomReservation();
		roomreservation.setRoomId(room.getRoomid());
		roomreservation.setRoomName(room.getRoomName());
		roomreservation.setRoomNumber(room.getRoomNumber());
		roomreservationmap.put(room.getRoomid(), roomreservation);
		
		});
		Iterable<Reservation> reservations = this.reservationrepo.findReservationByreservationDate(new java.sql.Date(date.getTime()));
        reservations.forEach(reservation -> {
            RoomReservation roomReservation = roomreservationmap.get(reservation.getRoomId());
            roomReservation.setDate(date);
            Guest guest = this.guestrepo.findById(reservation.getGuestId()).get();
            roomReservation.setFirstName(guest.getFn());
            roomReservation.setLastName(guest.getLn());
            roomReservation.setGuestId(guest.getGuestId());
        });
		
		List<RoomReservation> roomreservations=new ArrayList<>();
		for(Long id:roomreservationmap.keySet())
		{
			roomreservations.add(roomreservationmap.get(id));
		}
		return roomreservations;
	}


	
}
