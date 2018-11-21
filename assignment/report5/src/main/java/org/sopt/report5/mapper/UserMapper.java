package org.sopt.report5.mapper;

import org.apache.ibatis.annotations.*;
import org.sopt.report5.dto.User;

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
    List<User> findByPart(@Param("name") final String part);

    // 아이디로 조회
    @Select("SELECT id, profileUrl, name, part FROM user WHERE id = #{id}")
    User findById(@Param("id") final String id);

    // 회원 추가
    //@Insert("INSERT")


    // 회원 삭제
    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteUser(@Param("id") final String id);
}
