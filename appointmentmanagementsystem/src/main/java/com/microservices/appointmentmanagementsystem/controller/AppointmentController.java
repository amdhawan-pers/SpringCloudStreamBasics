package com.microservices.appointmentmanagementsystem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.messagingcommon.AppointmentEvent;
import com.microservices.appointmentmanagementsystem.service.AppointmentManagementService;
import com.microservices.messagingcommon.AppointmentStatus;

@RestController
public class AppointmentController {
	
	private static final Logger logger=LoggerFactory.getLogger(AppointmentController.class);
	@Autowired
	AppointmentManagementService service;
	
	@PostMapping("/appointment-management-service/appointments")
	public void bookAppointment(@RequestBody AppointmentEvent appointmentEvent) {
		logger.info("Appointment request received {}",appointmentEvent);
		appointmentEvent.setStatus(AppointmentStatus.INITIATED);
		boolean isSent = service.send(appointmentEvent);
		logger.info("Appointment booking initiated {}",isSent);
		//Create resource location
		//service.processAppointment(event);
	}

}
