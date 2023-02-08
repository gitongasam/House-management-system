package com.devsam.bookningmanagementservice.VO;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {

    private Long id;
    private String apartment;
    private String address;
    private String bedrooms;
    private double price;


}
