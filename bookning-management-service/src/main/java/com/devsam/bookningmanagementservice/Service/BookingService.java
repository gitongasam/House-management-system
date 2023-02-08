package com.devsam.bookningmanagementservice.Service;

import com.devsam.bookningmanagementservice.Entity.Booking;
import com.devsam.bookningmanagementservice.Repository.BookingRepository;
import com.devsam.bookningmanagementservice.VO.House;
import com.devsam.bookningmanagementservice.VO.ResponseTemplateVO;
import com.devsam.bookningmanagementservice.VO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {
      return bookingRepository.save(booking);
    }

    public ResponseTemplateVO getUserWithHouse(Long bookingId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Booking booking = bookingRepository.findByBookingId(bookingId);
        House house = restTemplate.getForObject("http://HOUSE-SERVICE/house/"+booking.getHouseId(), House.class);
        User user = restTemplate.getForObject("http://USER-SERVICE/api/auth/"+booking.getUserId(), User.class);
        vo.setUser(user);
        vo.setHouse(house);
        return vo;
    }
}
