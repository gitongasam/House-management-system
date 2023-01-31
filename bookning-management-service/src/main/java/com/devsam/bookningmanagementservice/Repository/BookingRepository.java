package com.devsam.bookningmanagementservice.Repository;

import com.devsam.bookningmanagementservice.Entity.Booking.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
