package com.mytoshika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytoshika.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
