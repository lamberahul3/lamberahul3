package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.billing;

public interface billingRepository extends JpaRepository<billing, Long> {

}
