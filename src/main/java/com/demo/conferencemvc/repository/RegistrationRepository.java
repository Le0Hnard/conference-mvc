package com.demo.conferencemvc.repository;

import com.demo.conferencemvc.model.Registration;
import com.demo.conferencemvc.model.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    List<RegistrationReport> registrationReport();

}
