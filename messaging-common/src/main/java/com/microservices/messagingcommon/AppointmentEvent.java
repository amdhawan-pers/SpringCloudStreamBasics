package com.microservices.messagingcommon;

public class AppointmentEvent {
	
	private String patientID;
	private String appointmentdate;
	private String appointmentSlot;
	private String appointmentRequestDoctor;

	private String appointmentID;
	private AppointmentStatus appointmentStatus;
	
	
	public AppointmentEvent() {
		
	}
	
	public AppointmentEvent(String patientID, String appointmentdate, String appointmentSlot ,
			String doctorRequested) {
		super();
		this.appointmentdate = appointmentdate;
		this.appointmentSlot = appointmentSlot;
		this.patientID = patientID;
		this.appointmentRequestDoctor = doctorRequested;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getAppointmentdate() {
		return appointmentdate;
	}

	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}

	public String getAppointmentSlot() {
		return appointmentSlot;
	}

	public void setAppointmentSlot(String appointmentSlot) {
		this.appointmentSlot = appointmentSlot;
	}

	public String getAppointmentRequestDoctor() {
		return appointmentRequestDoctor;
	}

	public void setAppointmentRequestDoctor(String appointmentRequestDoctor) {
		this.appointmentRequestDoctor = appointmentRequestDoctor;
	}

	public String getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}

	public AppointmentStatus getStatus() {
		return appointmentStatus;
	}

	public void setStatus(AppointmentStatus status) {
		this.appointmentStatus = status;
	}

	@Override
	public String toString() {
		return "AppointmentEvent [patientID=" + patientID + ", appointmentdate=" + appointmentdate
				+ ", appointmentSlot=" + appointmentSlot + ", appointmentRequestDoctor=" + appointmentRequestDoctor
				+ ", appointmentID=" + appointmentID + ", status=" + appointmentStatus + "]";
	}
	

}
