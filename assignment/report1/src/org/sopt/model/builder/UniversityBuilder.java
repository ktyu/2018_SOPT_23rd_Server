package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    //대학 고유 번호
    private int uniIdx;

    //대학 이름
    private String uniName;

    //대학 전화번호
    private String uniPhoneNum;

    //대학주소
    private String uniAddress;

    public UniversityBuilder setUniIdx(final int idx) {
        this.uniIdx = idx;
        return this;
    }

    public UniversityBuilder setUniName(final String name) {
        this.uniName = name;
        return this;
    }

    public UniversityBuilder setUniPhoneNum(final String phoneNum) {
        this.uniPhoneNum = phoneNum;
        return this;
    }

    public UniversityBuilder setUniAddress(final String address) {
        this.uniAddress = address;
        return this;
    }

    public University build() {
        return new University(this.uniIdx, this.uniName, this.uniPhoneNum, this.uniAddress);
    }
}
