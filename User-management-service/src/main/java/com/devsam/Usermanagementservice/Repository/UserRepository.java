package com.devsam.Usermanagementservice.Repository;

import com.devsam.Usermanagementservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUserName(String userName);

}
