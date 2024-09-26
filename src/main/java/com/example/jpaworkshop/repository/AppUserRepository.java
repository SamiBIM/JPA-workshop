package com.example.jpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.jpaworkshop.entity.AppUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
    Optional<AppUser> findByUsername(String username);
    Optional<List<AppUser>> findByRegDateBetween(LocalDate startDate, LocalDate endDate);
    Optional<AppUser> findByDetails_Id(int detailsId);
    Optional<AppUser> findByDetails_Email_IgnoreCase(String email);
}