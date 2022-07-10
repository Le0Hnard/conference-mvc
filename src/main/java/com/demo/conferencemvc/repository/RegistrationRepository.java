package com.demo.conferencemvc.repository;

import com.demo.conferencemvc.model.Registration;
import com.demo.conferencemvc.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
