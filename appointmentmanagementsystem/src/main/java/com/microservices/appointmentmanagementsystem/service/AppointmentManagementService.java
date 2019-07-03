package com.microservices.appointmentmanagementsystem.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.microservices.appointmentmanagementsystem.bean.Appointment;
import com.microservices.appointmentmanagementsystem.repository.AppointmentRepository;
import com.microservices.messagingcommon.AppointmentEvent;
import com.microservices.messagingcommon.AppointmentStatus;

@Service
public class AppointmentManagementService {
	
	private static final Logger logger=LoggerFactory.getLogger(AppointmentManagementService.class);
	@Autowired
	AppointmentRepository repository;
	@Autowired
	private Source source;

	public boolean send(AppointmentEvent appointmentEvent) {
		logger.info("Sending event {} ",appointmentEvent);
	    return this.source.output().send(MessageBuilder.withPayload(appointmentEvent).build());
	}

	@StreamListener(Sink.INPUT)
	public void receiveAppointmentRequest(AppointmentEvent event) {
	   logger.info("Received appointment details request {}",event);
	   processAppointment(event);	  
    }

	public void processAppointment(AppointmentEvent event) {
		if(event.getStatus().equals(AppointmentStatus.AVAILABLE)) {
			Appointment appt=new Appointment(event.getAppointmentdate(),event.getAppointmentID(),AppointmentStatus.BOOKED,event.getPatientID(),event.getAppointmentRequestDoctor());
			repository.save(appt);
			logger.info("Appointment Details saved to repository ");
		 }
		send(event);
    }
	
}
