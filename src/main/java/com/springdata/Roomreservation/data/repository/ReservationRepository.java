package com.springdata.Roomreservation.data.repository;


import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springdata.Roomreservation.data.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	
	Iterable<Reservation> findReservationByreservationDate(Date date);
}
