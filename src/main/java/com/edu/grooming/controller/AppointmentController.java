package com.edu.grooming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.grooming.dao.Appointment;
import com.edu.grooming.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	@PostMapping("/saveAppointment") //http://localhost:8990/saveAppointment
	public Appointment saveAppointment(@RequestBody Appointment appointment) {
		return appointmentService.saveAppointment(appointment);
	}

	@GetMapping("/getAllAppointments") //http://localhost:8990/getAllAppoinments
	public List<Appointment> getAllAppointments() {
		return appointmentService.getAllAppointments();
	}
}