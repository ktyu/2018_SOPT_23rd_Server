package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {
    //학과 고유 번호
    private int depIdx;

    //학과 이름
    private String depName;

    //학과 전화번호
    private String depPhoneNum;

    //학과 타입(공대, 자연대, 사범대, 치대..)
    private String depCollege;


    public DepartmentBuilder setDepIdx(final int idx) {
        this.depIdx = idx;
        return this;
    }

    public DepartmentBuilder setDepName(final String name) {
        this.depName = name;
        return this;
    }

    public DepartmentBuilder setDepPhoneNum(final String phoneNum) {
        this.depPhoneNum = phoneNum;
        return this;
    }

    public DepartmentBuilder setDepCollege(final String college) {
        this.depCollege = college;
        return this;
    }

    public Department build() {
        return new Department(this.depIdx, this.depName, this.depPhoneNum, this.depCollege);
    }

}
