package com.springdata.Roomreservation.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdata.Roomreservation.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest,Long>{

}
