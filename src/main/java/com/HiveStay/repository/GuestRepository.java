package com.HiveStay.repository;

import com.HiveStay.entity.Guest;
import com.HiveStay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}