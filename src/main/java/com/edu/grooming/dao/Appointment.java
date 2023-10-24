package com.edu.grooming.dao;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentId;
//	private Integer userId;
//	private Integer stylistId;
//	private Integer serviceId;
	@NotNull(message = "Appointment Date should not be empty")
	@FutureOrPresent
	@Column(name = "appointmentDate", nullable = false)
	private Date appointmentDate;

	@NotNull(message = "Appointment Starttime should not be empty")
	@FutureOrPresent
	@Column(name = "appointmentStartTime", nullable = false)
	private Time appointmentStartTime;

	@NotNull(message = "Appointment Endtime should not be empty")
	@FutureOrPresent
	@Column(name = "appointmentEndTime", nullable = false)
	private Time appointmentEndTime;

	@NotBlank(message = "Appointment Status Should not be empty")
	@Column(name = "appointmentStatus", nullable = false)
	private String appointmentStatus;
//	private String appointmentLocation;

	public Appointment() {
		super();
	}

	public Appointment(@NotNull(message = "Appointment Date should not be empty") Date appointmentDate,
			@NotNull(message = "Appointment Starttime should not be empty") Time appointmentStartTime,
			@NotNull(message = "Appointment Endtime should not be empty") Time appointmentEndTime,
			@NotBlank(message = "Appointment Status Should not be empty") String appointmentStatus) {
		super();
		this.appointmentDate = appointmentDate;
		this.appointmentStartTime = appointmentStartTime;
		this.appointmentEndTime = appointmentEndTime;
		this.appointmentStatus = appointmentStatus;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Time getAppointmentStartTime() {
		return appointmentStartTime;
	}

	public void setAppointmentStartTime(Time appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}

	public Time getAppointmentEndTime() {
		return appointmentEndTime;
	}

	public void setAppointmentEndTime(Time appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDate=" + appointmentDate
				+ ", appointmentStartTime=" + appointmentStartTime + ", appointmentEndTime=" + appointmentEndTime
				+ ", appointmentStatus=" + appointmentStatus + "]";
	}
}
