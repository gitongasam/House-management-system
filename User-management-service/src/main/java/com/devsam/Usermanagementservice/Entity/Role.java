package com.devsam.Usermanagementservice.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 60)
    private String name;
}

