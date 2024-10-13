package com.example.patientsystem.controller;

import com.example.patientsystem.model.Patient;
import com.example.patientsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/register")
    public ResponseEntity<Patient> registerPatient1(@RequestBody Patient patient) {
        return new ResponseEntity<>(patientService.savePatient(patient), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAllPatients() {
        return new ResponseEntity<>(patientService.getAllPatients(), HttpStatus.OK);
    }

    // Remove these methods if you're using the REST API
    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient_registration";
    }

    @PostMapping("/registration")
    public String registerPatient(@ModelAttribute("patient") Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patients/all";
    }

    @GetMapping("/list")
    public String getAllPatients(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        return "patient_list";
    }

	public ResponseEntity<Patient> createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}
}