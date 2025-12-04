package com.nirmaan.quizapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.quizapplication.entity.Laptop;
@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {

}
