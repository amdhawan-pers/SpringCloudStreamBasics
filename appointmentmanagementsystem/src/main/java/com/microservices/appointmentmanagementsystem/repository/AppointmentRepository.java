package com.microservices.appointmentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservices.appointmentmanagementsystem.bean.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

}
