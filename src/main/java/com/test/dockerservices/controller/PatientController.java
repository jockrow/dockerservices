package com.test.dockerservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.dockerservices.exception.ModelNotFoundException;
import com.test.dockerservices.model.Patient;
import com.test.dockerservices.service.PatientService;

import java.util.Optional;
@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/save")
    public long save(@RequestBody Patient patient) {
        patientService.save(patient);
        return patient.getId();
    }

    @GetMapping("/listAll")
    public Iterable<Patient> listAllPatients() {
        return patientService.list();
    }

    @GetMapping("/list/{id}")
    public Patient listPatientById(@PathVariable("id") int id) {
        Optional<Patient> patient = patientService.listId(id);
        if (patient.isPresent()) {
            return patient.get();
        }

        throw new ModelNotFoundException("Invalid find patient provided");
    }
}
