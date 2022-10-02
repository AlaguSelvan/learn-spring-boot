package com.selvan.springboot.learnjpaandhibernate.course;

import com.selvan.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.selvan.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataRepository repository;

    @Override
    public void run(String... args) throws Exception{
        // TODO Auto-generated method
        repository.save(new Course(1, "AWS", "in28minutes"));
        repository.save(new Course(2, "Azure", "in28minutes"));
        repository.save(new Course(3, "Devops", "in28minutes"));
        repository.save(new Course(4, "Ds&Algo", "in28minutes"));

        repository.deleteById(2l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(2l));

        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor("in28minutes1"));

        System.out.println(repository.findByName("Ds&Algo"));

    }
}
