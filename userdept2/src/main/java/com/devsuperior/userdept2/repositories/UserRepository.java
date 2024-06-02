package com.devsuperior.userdept2.repositories;

import com.devsuperior.userdept2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
