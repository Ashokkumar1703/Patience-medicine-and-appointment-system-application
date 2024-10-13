package com.example.patientsystem.service;

import com.example.patientsystem.model.Patient;
import com.example.patientsystem.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PatientServiceTest {

    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientService patientService;

    public PatientServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSavePatient() {
        Patient patient = new Patient();
        when(patientRepository.save(patient)).thenReturn(patient);
        assertNotNull(patientService.savePatient(patient));
    }
}