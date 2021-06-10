package com.arjuncodes.connectmysql.repository;

import com.arjuncodes.connectmysql.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
