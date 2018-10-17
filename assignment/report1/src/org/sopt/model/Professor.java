package org.sopt.model;

public class Professor extends Department {
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


    public Professor() {
    }

    public Professor(int profIdx, String profName, String profDep, String profPhoneNum, String profSubj) {
        this.profIdx = profIdx;
        this.profName = profName;
        this.profDep = profDep;
        this.profPhoneNum = profPhoneNum;
        this.profSubj = profSubj;
    }

    public int getProfIdx() {
        return profIdx;
    }

    public void setProfIdx(int profIdx) {
        this.profIdx = profIdx;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfDep() {
        return profDep;
    }

    public void setProfDep(String profDep) {
        this.profDep = profDep;
    }

    public String getProfPhoneNum() {
        return profPhoneNum;
    }

    public void setProfPhoneNum(String profPhoneNum) {
        this.profPhoneNum = profPhoneNum;
    }

    public String getProfSubj() {
        return profSubj;
    }

    public void setProfSubj(String profSubj) {
        this.profSubj = profSubj;
    }

    @Override
    public String toString() {
        return "교수 객체 입니다.";
    }
}
