package com.project.learning.projectdemo.service;

import com.project.learning.projectdemo.mapper.readers.StudentReaderMapper;
import com.project.learning.projectdemo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentReaderMapper studentReaderMapper;

    @Override
    public void addStudent(Student student)
    {
        studentReaderMapper.addStudent(student);
    }
}
