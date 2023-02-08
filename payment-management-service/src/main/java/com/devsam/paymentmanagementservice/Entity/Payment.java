package com.devsam.paymentmanagementservice.Entity;

import com.devsam.paymentmanagementservice.VO.Booking;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Booking booking;

    private Long amount;
}
