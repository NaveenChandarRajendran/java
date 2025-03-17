package com.spring.learn_jpa_hibernate.course.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn_jpa_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {
	
	
	
}
