package com.test.dockerservices.service;

import com.test.dockerservices.dao.IPatientDAO;
import com.test.dockerservices.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private IPatientDAO dao;

    public Patient save(Patient t) {
        return dao.save(t);
    }

    public Patient update(Patient t) {
        return dao.save(t);
    }

    public void delete(Patient t) {
        dao.delete(t);
    }

    public Iterable<Patient> list() {
        return dao.findAll();
    }

    public Optional<Patient> listId(long id) {
        return dao.findById(id);
    }

}
