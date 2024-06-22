package com.gaurish.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaurish.StudentManagementSystem.entity.Student;
@Repository
public interface Studentrepository extends JpaRepository<Student, Integer>{

	
}
