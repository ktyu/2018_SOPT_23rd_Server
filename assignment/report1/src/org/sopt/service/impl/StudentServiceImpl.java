package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceImpl implements StudentService {

    @Override
    public Student getByStudentNum(final int num) {

        //Builder로 객체 생성해서 반환
        Student stu = new StudentBuilder()
                .setStuNum(num)
                .build();

        return stu;
    }

}
