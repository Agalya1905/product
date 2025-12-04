package com.nirmaan.quizapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.quizapplication.entity.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
