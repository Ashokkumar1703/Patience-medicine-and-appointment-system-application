package com.example.patientsystem.controller;

import com.example.patientsystem.model.Medication;
import com.example.patientsystem.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {
    @Autowired
    private MedicationService medicationService;

    @PostMapping("/add")
    public ResponseEntity<Medication> addMedication(@RequestBody Medication medication) {
        return new ResponseEntity<>(medicationService.addMedication(medication), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Medication>> getAllMedications() {
        return new ResponseEntity<>(medicationService.getAllMedications(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Medication> updateMedication(@RequestBody Medication medication) {
        return new ResponseEntity<>(medicationService.updateMedication(medication), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMedication(@PathVariable Long id) {
        medicationService.deleteMedication(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}