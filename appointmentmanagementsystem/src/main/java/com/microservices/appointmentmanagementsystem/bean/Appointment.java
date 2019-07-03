package com.microservices.appointmentmanagementsystem.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.microservices.messagingcommon.AppointmentStatus;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue
	private String appointmentID;
	private String appointmentdate;
	private AppointmentStatus appointmentStatus;
	private String appPatientID;
	private String doctorName;
	
	public Appointment() {
		
	}
	public Appointment(String appointmentID, String appointmentdate, AppointmentStatus appointmentStatus,
			String appPatientID, String doctorName) {
		super();
		this.appointmentID = appointmentID;
		this.appointmentdate = appointmentdate;
		this.appointmentStatus = appointmentStatus;
		this.appPatientID = appPatientID;
		this.doctorName = doctorName;
	}
	
	public String getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}
	public String getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public AppointmentStatus getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	public String getAppPatientID() {
		return appPatientID;
	}
	public void setAppPatientID(String appPatientID) {
		this.appPatientID = appPatientID;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	@Override
	public String toString() {
		return "AppointmentEntity [appointmentID=" + appointmentID + ", appointmentdate=" + appointmentdate
				+ ", appointmentStatus=" + appointmentStatus + ", appPatientID=" + appPatientID + ", doctorName="
				+ doctorName + "]";
	}
}
