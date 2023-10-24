package com.edu.grooming.service;

import java.util.List;

import com.edu.grooming.dao.Appointment;

public interface AppointmentService {

	Appointment saveAppointment(Appointment appointment);

	List<Appointment> getAllAppointments();

}
