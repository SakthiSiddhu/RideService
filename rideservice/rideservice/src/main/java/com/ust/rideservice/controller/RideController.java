package com.ust.rideservice.controller;

import com.ust.rideservice.client.Response;
import com.ust.rideservice.dto.RideDto;
import com.ust.rideservice.model.Ride;
import com.ust.rideservice.repository.RideRepository;
import com.ust.rideservice.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ride")
public class RideController {

    @Autowired
    RideService rideService;

    @PostMapping("/request/{userid}")
            public String requestRide(@RequestBody RideDto ride, @PathVariable long userid){
        return rideService.requestRide(userid,ride);
    }

    @GetMapping("/{userid}")
    public List<Ride> getRideByUser(@PathVariable long userid) {
        return  rideService.getRideByUser(userid);
    }

    }

