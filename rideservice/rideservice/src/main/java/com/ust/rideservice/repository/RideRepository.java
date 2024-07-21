package com.ust.rideservice.repository;

import com.ust.rideservice.client.Response;
import com.ust.rideservice.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {

    Optional<List<Ride>> findByUserid(long userid);
}
