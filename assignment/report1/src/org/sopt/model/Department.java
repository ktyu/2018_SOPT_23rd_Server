package org.sopt.model;

public class Department extends University {
    //학과 고유 번호
    private int depIdx;

    //학과 이름
    private String depName;

    //학과 전화번호
    private String depPhoneNum;

    //학과 타입(공대, 자연대, 사범대, 치대..)
    private String depCollege;


    public Department() {

    }

    public Department(int depIdx, String depName, String depPhoneNum, String depCollege) {
        this.depIdx = depIdx;
        this.depName = depName;
        this.depPhoneNum = depPhoneNum;
        this.depCollege = depCollege;
    }

    public int getDepIdx() {
        return depIdx;
    }

    public void setDepIdx(int depIdx) {
        this.depIdx = depIdx;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepPhoneNum() {
        return depPhoneNum;
    }

    public void setDepPhoneNum(String depPhoneNum) {
        this.depPhoneNum = depPhoneNum;
    }

    public String getDepCollege() {
        return depCollege;
    }

    public void setDepCollege(String depCollege) {
        this.depCollege = depCollege;
    }

    @Override
    public String toString() {
        return "학과 객체 입니다.";
    }
}
