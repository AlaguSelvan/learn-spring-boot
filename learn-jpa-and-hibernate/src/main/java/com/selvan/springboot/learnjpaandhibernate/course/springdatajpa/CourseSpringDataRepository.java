package com.selvan.springboot.learnjpaandhibernate.course.springdatajpa;

import com.selvan.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
    public List<Course> findByAuthor(String Author);
    public List<Course> findByName(String Name);

}
