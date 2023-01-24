package com.devsam.Usermanagementservice.Repository;

import com.devsam.Usermanagementservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<Object> findByEmail(String email);

    String getEmail();
}
