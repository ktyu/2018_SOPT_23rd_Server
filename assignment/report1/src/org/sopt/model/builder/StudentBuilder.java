package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
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

    public StudentBuilder setStuNum(final int num) {
        this.stuNum = num;
        return this;
    }

    public StudentBuilder setStuName(final String name) {
        this.stuName = name;
        return this;
    }

    public StudentBuilder setStuGrade(final int grade) {
        this.stuGrade = grade;
        return this;
    }

    public StudentBuilder setStuDep(final String dep) {
        this.stuDep = dep;
        return this;
    }

    public StudentBuilder setStuEmail(final String email) {
        this.stuEmail = email;
        return this;
    }

    public StudentBuilder setStuAddress(final String address) {
        this.stuAddress = address;
        return this;
    }

    public StudentBuilder setStuAge(final int age) {
        this.stuAge = age;
        return this;
    }

    public StudentBuilder setStuStatus(final int status) {
        this.stuStatus = status;
        return this;
    }

    public Student build() {
        return new Student(this.stuNum, this.stuName, this.stuGrade, this.stuDep, this.stuEmail, this.stuAddress, this.stuAge, this.stuStatus);
    }

}
