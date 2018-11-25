package org.sopt.report5.mapper;

import org.apache.ibatis.annotations.*;
import org.sopt.report5.dto.User;
import org.sopt.report5.model.SignUpReq;

import java.util.List;

@Mapper
public interface UserMapper {

    // 모든 회원 리스트 조회 - List라고 적으면 ArrayList로 반환됨
    @Select("SELECT id, profileUrl, name, part FROM user")
    List<User> findAll();

    // 회원 이름으로 조회
    @Select("SELECT id, profileUrl, name, part FROM user WHERE name = #{name}")
    List<User> findByName(@Param("name") final String name);

    // 파트로 조회
    @Select("SELECT id, profileUrl, name, part FROM user WHERE part = #{part}")
    List<User> findByPart(@Param("part") final String part);

    // 아이디로 조회
    @Select("SELECT id, profileUrl, name, part FROM user WHERE id = #{id}")
    User findById(@Param("id") final String id);

    //회원 추가, Auto Increment는 회원 고유 번호
    //Auto Increment 값을 받아오고 싶으면 리턴 타입을 int(Auto Increment 컬럼 타입)으로 하면 된다.
    @Insert("INSERT INTO user(userIdx, id, password, profileUrl, name, part) VALUES(null, #{signUpReq.id}, #{signUpReq.password}, #{signUpReq.profileUrl}, #{signUpReq.name}, #{signUpReq.part})")
    @Options(useGeneratedKeys = true, keyColumn = "userIdx")
    Integer insertUser(@Param("signUpReq") final SignUpReq signUpReq);

    //회원정보 수정
    @Update("UPDATE user SET name password = #{signUpReq.password}, profileUrl = #{signUpReq.profileUrl}, name = #{signUpReq.name}, part = #{signUpReq.part})")
    void updateUser(@Param("signUpReq") final SignUpReq signUpReq);


    // 회원 삭제
    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteUser(@Param("id") final String id);
}
