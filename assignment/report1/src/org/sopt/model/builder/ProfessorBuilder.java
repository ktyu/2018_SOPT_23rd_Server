package org.sopt.model.builder;

import org.sopt.model.Professor;

public class ProfessorBuilder {
    //교수 고유 번호
    private int profIdx;

    //교수 이름
    private String profName;

    //교수 학과
    private String profDep;

    //교수 전화번호
    private String profPhoneNum;

    //담당 과목
    private String profSubj;

    public ProfessorBuilder setProfIdx(final int idx) {
        this.profIdx = idx;
        return this;
    }

    public ProfessorBuilder setProfName(final String name) {
        this.profName = name;
        return this;
    }

    public ProfessorBuilder setProfDep(final String dep) {
        this.profDep = dep;
        return this;
    }

    public ProfessorBuilder setProfPhoneNum(final String phoneNum) {
        this.profPhoneNum = phoneNum;
        return this;
    }

    public ProfessorBuilder setProfSubj(final String subj) {
        this.profSubj = subj;
        return this;
    }

    public Professor build() {
        return new Professor(this.profIdx, this.profName, this.profDep, this.profPhoneNum, this.profSubj);
    }
}
