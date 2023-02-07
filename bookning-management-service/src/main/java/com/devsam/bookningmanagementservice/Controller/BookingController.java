package com.devsam.bookningmanagementservice.Controller;
import com.devsam.Housemanagementservice.Entity.House;
import com.devsam.Usermanagementservice.Entity.User;
import com.devsam.bookningmanagementservice.Entity.Booking.Booking;
import com.devsam.bookningmanagementservice.Entity.Booking.BookingRequest;
import com.devsam.bookningmanagementservice.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookingController {

    private final RestTemplate restTemplate;

    private BookingRepository bookingRepository;

    public BookingController(RestTemplate restTemplate, BookingRepository bookingRepository) {
        this.restTemplate = restTemplate;
        this.bookingRepository = bookingRepository;
    }


    @PostMapping("/bookings")
    public Booking bookHouse(@RequestBody BookingRequest bookingRequest) {
        String userUrl = "http://localhost8082/api/auth" + bookingRequest.getUserId();
        String houseUrl = "http://localhost:8083/houses/" + bookingRequest.getHouseId();

        User user = restTemplate.getForObject(userUrl, User.class);
        House house = restTemplate.getForObject(houseUrl, House.class);

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setHouse(house);
        booking.setStartDate(bookingRequest.getStartDate());

        Booking savedBooking = bookingRepository.save(booking);

        return  savedBooking;
    }

}
