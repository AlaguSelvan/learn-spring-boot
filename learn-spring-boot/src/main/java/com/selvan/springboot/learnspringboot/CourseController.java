package com.selvan.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn Devops", "in28minutes"),
                new Course(3, "Learn Java", "in28minutes")
                //            new Course(4, "Learn DS&Algo", "in28minutes")
        );
    }
}
