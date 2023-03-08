package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Citizen;

public interface Crepo extends JpaRepository<Citizen, Long> {

}