package com.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.book.entity.Expert;

@Repository
public interface ExpertRepository extends JpaRepository<Expert, Integer> {

}
