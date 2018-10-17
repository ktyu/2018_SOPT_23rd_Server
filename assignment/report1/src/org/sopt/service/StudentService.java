package org.sopt.service;

import org.sopt.model.Student;

public interface StudentService {
    Student getByStudentNum(final int num);
}
