package com.example.patientsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 6, message = "Password should have at least 6 characters")
    private String password;

	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters
}