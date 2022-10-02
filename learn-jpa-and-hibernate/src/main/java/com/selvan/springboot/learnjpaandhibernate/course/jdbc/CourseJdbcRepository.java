package com.selvan.springboot.learnjpaandhibernate.course.jdbc;

import com.selvan.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            INSERT INTO Course (id, name, author) VALUES (?, ?, ?)
            """;
    private static String DELETE_QUERY = """
            DELETE FROM Course WHERE id = ?
            """;
    private static String SELECT_QUERY = """
            SELECT * FROM Course WHERE id = ?
            """;
    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course selectById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
