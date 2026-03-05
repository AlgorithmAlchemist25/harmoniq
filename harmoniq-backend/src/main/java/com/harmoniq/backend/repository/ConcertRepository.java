package com.harmoniq.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harmoniq.backend.model.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long> {
}