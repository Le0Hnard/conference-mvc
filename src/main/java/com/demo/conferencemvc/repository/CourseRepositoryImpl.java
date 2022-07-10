package com.demo.conferencemvc.repository;

import com.demo.conferencemvc.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Course save(Course course) {
        entityManager.persist(course);

        return course;
    }

}
