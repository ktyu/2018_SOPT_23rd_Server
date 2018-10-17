package org.sopt.model;

public class University {
    //대학 고유 번호
    private int uniIdx;

    //대학 이름
    private String uniName;

    //대학 전화번호
    private String uniPhoneNum;

    //대학주소
    private String uniAddress;

    public University() {

    }

    public University(int uniIdx, String uniName, String uniPhoneNum, String uniAddress) {
        this.uniIdx = uniIdx;
        this.uniName = uniName;
        this.uniPhoneNum = uniPhoneNum;
        this.uniAddress = uniAddress;
    }

    public int getUniIdx() {
        return uniIdx;
    }

    public void setUniIdx(int uniIdx) {
        this.uniIdx = uniIdx;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getUniPhoneNum() {
        return uniPhoneNum;
    }

    public void setUniPhoneNum(String uniPhoneNum) {
        this.uniPhoneNum = uniPhoneNum;
    }

    public String getUniAddress() {
        return uniAddress;
    }

    public void setUniAddress(String uniAddress) {
        this.uniAddress = uniAddress;
    }

    @Override
    public String toString() {
        return "대학교 객체 입니다.";
    }
}
