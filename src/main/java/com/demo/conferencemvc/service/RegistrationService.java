package com.demo.conferencemvc.service;

import com.demo.conferencemvc.model.Registration;
import com.demo.conferencemvc.model.RegistrationReport;

import java.util.List;

public interface RegistrationService {
    Registration addRegistration(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
