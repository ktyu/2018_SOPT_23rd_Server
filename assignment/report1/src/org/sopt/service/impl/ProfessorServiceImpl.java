package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {

    @Override
    public Professor getByProfIdx(final int idx) {

        //Builder로 객체 생성해서 반환
        Professor prof = new ProfessorBuilder()
                .setProfIdx(idx)
                .build();

        return prof;
    }
}
