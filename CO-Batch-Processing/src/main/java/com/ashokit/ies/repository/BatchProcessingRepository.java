package com.ashokit.ies.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.entity.BatchRunDetails;

public interface BatchProcessingRepository extends JpaRepository<BatchRunDetails, Serializable> {

}
