package com.test.dockerservices.dao;

import com.test.dockerservices.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientDAO extends CrudRepository<Patient, Long> {
}
