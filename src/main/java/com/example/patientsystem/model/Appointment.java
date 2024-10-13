package com.example.patientsystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_id")
    private Long patientId; // Field that will be used to reference the patient

    @ManyToOne
    @JoinColumn(name = "patient_id", insertable = false, updatable = false)
    private Patient patient; // This is for fetching the Patient object
    
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor; // Keep this field

	

    // Remove the doctorId field, as it's redundant

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Doctor getDoctor() {
        return doctor; // Getter for the doctor field
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor; // Setter for the doctor field
    }

    public LocalDateTime getAppointmentDateTime() {
        return getAppointmentDateTime();
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
    }

    // Getters and Setters for other fields...
}