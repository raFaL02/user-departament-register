package com.devrafxxx.userdept.repository;

import com.devrafxxx.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
