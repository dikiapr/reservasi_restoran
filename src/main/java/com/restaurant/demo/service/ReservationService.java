package com.restaurant.demo.service;

import com.restaurant.demo.model.Reservation;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    public List<Reservation> getWeeklyReservation() {
        List<Reservation> weeklyReservation = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = currentDate.plusDays(6);

        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.WEDNESDAY && currentDate.getDayOfWeek() != DayOfWeek.FRIDAY) {
                weeklyReservation.add(new Reservation(currentDate, 2));
            }
            currentDate = currentDate.plusDays(1);
        }

        return weeklyReservation;
    }
}
