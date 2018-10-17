package org.sopt.report2.model;

public class User {

    //회원 고유번호
    private int userIdx;

    //회원 이름
    private String userName;

    //회원 파트
    private String userPart;


    public User() {
    }


    ///이 생성자 존재의 의미가 없는거 같음???
    public User(int userIdx, String userName, String userPart) {
        this.userIdx = userIdx;
        this.userName = userName;
        this.userPart = userPart;
    }


    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPart() {
        return userPart;
    }

    public void setUserPart(String userPart) {
        this.userPart = userPart;
    }

}
