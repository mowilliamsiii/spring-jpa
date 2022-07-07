package com.moseswilliamsiii.springjpa.repositories;

import com.moseswilliamsiii.springjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long>{
}
