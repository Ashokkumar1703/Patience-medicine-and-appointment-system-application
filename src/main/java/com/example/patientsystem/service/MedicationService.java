package com.example.patientsystem.service;

import com.example.patientsystem.model.Medication;
import com.example.patientsystem.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {
    @Autowired
    private MedicationRepository medicationRepository;

    public Medication addMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    public Medication updateMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    public void deleteMedication(Long id) {
        medicationRepository.deleteById(id);
    }
}