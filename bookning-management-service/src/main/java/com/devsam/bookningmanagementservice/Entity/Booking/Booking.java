package com.devsam.bookningmanagementservice.Entity.Booking;

import com.devsam.Housemanagementservice.Entity.House;
import com.devsam.Usermanagementservice.Entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDate startDate;

}

