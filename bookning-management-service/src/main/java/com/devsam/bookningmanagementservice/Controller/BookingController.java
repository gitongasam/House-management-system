package com.devsam.bookningmanagementservice.Controller;

import com.devsam.bookningmanagementservice.Entity.Booking;
import com.devsam.bookningmanagementservice.Service.BookingService;
import com.devsam.bookningmanagementservice.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @PostMapping("/save")
    public Booking saveBooking(@RequestBody Booking booking){
        return bookingService.saveBooking(booking);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithHouse(@PathVariable("id") Long bookingId){
       return bookingService.getUserWithHouse(bookingId);
    }
}
