package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {

    @Override
    public University getByUniversityName(final String name) {

        //Builder로 객체 생성해서 반환
        University uni = new UniversityBuilder()
                .setUniName(name)
                .build();

        return uni;
    }
}
