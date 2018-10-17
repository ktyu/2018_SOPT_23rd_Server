package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public Department getByDepartmentName(final String name) {

        //Builder로 객체 생성해서 반환
        Department dep = new DepartmentBuilder()
                .setDepName(name)
                .build();

        return dep;
    }
}
