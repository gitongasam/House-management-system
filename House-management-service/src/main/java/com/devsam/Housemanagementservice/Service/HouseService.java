package com.devsam.Housemanagementservice.Service;

import com.devsam.Housemanagementservice.Entity.House;

import java.util.List;
import java.util.Optional;

public interface HouseService {
    List<House> findAll();
    Optional<House> findById(Long id);
    House save(House house);
    void deleteById(Long id);
}
