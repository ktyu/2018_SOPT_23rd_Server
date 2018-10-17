package org.sopt;

import org.sopt.model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ////학교 객체 테스트
        //제네릭을 사용해 ArrayList 생성
        final ArrayList<University> uniList = new ArrayList<University>();

        ///3개의 객체 생성
        final University uni1 = new University();
        final University uni2 = new University();
        final University uni3 = new University();

        //ArrayList에 객체 Add
        uniList.add(uni1);
        uniList.add(uni2);
        uniList.add(uni3);

        //ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for(final University obj : uniList) {
            System.out.println(obj.toString());
        }




        ////학과 객체 테스트
        //제네릭을 사용해 ArrayList 생성
        final ArrayList<Department> depList = new ArrayList<Department>();

        ///3개의 객체 생성
        final Department dep1 = new Department();
        final Department dep2 = new Department();
        final Department dep3 = new Department();

        //ArrayList에 객체 Add
        depList.add(dep1);
        depList.add(dep2);
        depList.add(dep3);

        //ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for(final Department obj : depList) {
            System.out.println(obj.toString());
        }




        ////교수 객체 테스트
        //제네릭을 사용해 ArrayList 생성
        final ArrayList<Professor> profList = new ArrayList<Professor>();

        ///3개의 객체 생성
        final Professor prof1 = new Professor();
        final Professor prof2 = new Professor();
        final Professor prof3 = new Professor();

        //ArrayList에 객체 Add
        profList.add(prof1);
        profList.add(prof2);
        profList.add(prof3);

        //ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for(final Professor obj : profList) {
            System.out.println(obj.toString());
        }



        ////학생 객체 테스트
        //제네릭을 사용해 ArrayList 생성
        final ArrayList<Student> stuList = new ArrayList<Student>();

        ///3개의 객체 생성
        final Student stu1 = new Student();
        final Student stu2 = new Student();
        final Student stu3 = new Student();

        //ArrayList에 객체 Add
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);

        //ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for(final Student obj : stuList) {
            System.out.println(obj.toString());
        }

    }
}
