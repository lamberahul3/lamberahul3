package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.lead;

public interface leadRepository extends JpaRepository<lead, Long> {

}
