package com.example.patientsystem.repository;

import com.example.patientsystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}