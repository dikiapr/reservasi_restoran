package com.restaurant.demo.controller;

import com.restaurant.demo.model.Reservation;
import com.restaurant.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/weekly-reservation")
    public ResponseEntity<List<Reservation>> getWeeklyReservation() {
        List<Reservation> weeklyReservation = reservationService.getWeeklyReservation();
        return ResponseEntity.ok(weeklyReservation);
    }
}