package org.sopt.model;

public class Student extends Department {
    //학번
    private int stuNum;

    //이름
    private String stuName;

    //학년
    private int stuGrade;

    //학과
    private String stuDep;

    //이메일
    private String stuEmail;

    //주소
    private String stuAddress;

    //나이
    private int stuAge;

    //현재 상태(휴학, 재학, 군휴학, 취업계)
    private int stuStatus;

    public Student() {
    }

    public Student(int stuNum, String stuName, int stuGrade, String stuDep, String stuEmail, String stuAddress, int stuAge, int stuStatus) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
        this.stuDep = stuDep;
        this.stuEmail = stuEmail;
        this.stuAddress = stuAddress;
        this.stuAge = stuAge;
        this.stuStatus = stuStatus;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuDep() {
        return stuDep;
    }

    public void setStuDep(String stuDep) {
        this.stuDep = stuDep;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public int getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(int stuStatus) {
        this.stuStatus = stuStatus;
    }

    @Override
    public String toString() {
        return "학생 객체 입니다.";
    }
}