package com.demo.conferencemvc.service;

import com.demo.conferencemvc.model.Course;
import com.demo.conferencemvc.model.Registration;
import com.demo.conferencemvc.model.RegistrationReport;
import com.demo.conferencemvc.repository.CourseRepository;
import com.demo.conferencemvc.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        registration = registrationRepository.save(registration);

        Course course = new Course();
        course.setName("Intro");
        course.setDescription("Every attendee must complete the intro");
        course.setRegistration(registration);

        courseRepository.save(course);

        return registration;
    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        return registrationRepository.findAllReports();
    }

}
