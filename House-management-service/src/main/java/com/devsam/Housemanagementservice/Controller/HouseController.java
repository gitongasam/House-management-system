package com.devsam.Housemanagementservice.Controller;

import com.devsam.Housemanagementservice.Entity.House;
import com.devsam.Housemanagementservice.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/house")
public class HouseController {
    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/find-all")
    public List<House> findAll() {
        return houseService.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<House> findById(@PathVariable Long id) {
        Optional<House> house = houseService.findById(id);
        if (house.isPresent()) {
            return ResponseEntity.ok(house.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/save-house")
    public House save(@RequestBody House house) {
        return houseService.save(house);
    }

    @DeleteMapping("/delete-by/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        houseService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

