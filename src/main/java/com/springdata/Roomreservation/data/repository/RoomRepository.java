package com.springdata.Roomreservation.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springdata.Roomreservation.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long>
{

}
