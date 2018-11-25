package org.sopt.report5.service;

import org.sopt.report5.dto.User;
import org.sopt.report5.model.DefaultRes;
import org.sopt.report5.model.SignUpReq;


public interface UserService {

    // 현재 시간 반환
    DefaultRes getCurrentTime();

    // 등록된 모든 회원의 정보 조회
    DefaultRes getAllUsers();

    // 이름으로 회원 조회
    DefaultRes findByName(final String name);

    // 파트로 회원 조회
    DefaultRes findByPart(final String part);

    // 아이디로 회원 조회
    DefaultRes findById(final String id);

    // 회원 정보 저장
    DefaultRes addUser(final SignUpReq signUpReq);

    // 회원 정보 수정
    DefaultRes modifyUser(String id, SignUpReq signUpReq);

    // 회원 삭제
    DefaultRes deleteUser(final String id);
}
