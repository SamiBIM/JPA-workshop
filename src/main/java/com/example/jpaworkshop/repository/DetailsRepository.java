package com.example.jpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.jpaworkshop.entity.Details;

import java.util.Optional;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {

    Optional<Details> findByNameContains(String name);
    Optional<Details> findByNameIgnoreCase(String name);
    Optional<Details> findByEmail(String email);

}
