package org.sopt.report5.service.impl;

import org.sopt.report5.dto.User;
import org.sopt.report5.mapper.UserMapper;
import org.sopt.report5.model.DefaultRes;
import org.sopt.report5.service.UserService;
import org.sopt.report5.util.ResponseMessage;
import org.sopt.report5.util.StatusCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public DefaultRes getCurrentTime() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String currentTime = dateFormat.format(date);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.GET_CURRENT_TIME, currentTime);
    }

    @Override
    public DefaultRes getAllUsers() {
        final List<User> userList = userMapper.findAll();

        // 저장된 유저가 없으면 NOT_FOUND 리턴
        if (userList.isEmpty())
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);

        // 리스트가 비어있지않으면 유저정보 리스트 리턴
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, userList);
    }

    @Override
    public DefaultRes findByName(String name) {
        final List<User> userList = userMapper.findByName(name);

        // 1명만 검색되었으면 User 객체 하나로 리턴
        if(userList.size() == 1) {
            return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, userList.get(0));
        }

        // 저장된 유저가 없으면 NOT_FOUND 리턴
        else if(userList.size() == 0) {
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
        }

        // 복수의 유저가 검색되었으면 List 로 전체 다 리턴
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, userList);
    }

    @Override
    public DefaultRes findByPart(String part) {
        final List<User> userList = userMapper.findByPart(part);

        // 1명만 검색되었으면 User 객체 하나로 리턴
        if(userList.size() == 1) {
            return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, userList.get(0));
        }

        // 저장된 유저가 없으면 NOT_FOUND 리턴
        else if(userList.size() == 0) {
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
        }

        // 복수의 유저가 검색되었으면 List 로 전체 다 리턴
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, userList);
    }

    @Override
    public DefaultRes findById(String id) {
        User user = userMapper.findById(id);

        // 검색된 user 가 없을 경우
        if (user == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);

        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, user);

    }

    @Override
    public DefaultRes addUser(User user) {
        return null;
    }

    @Override
    public DefaultRes modifyUser(String id, User user) {
        return null;
    }


    @Override
    public DefaultRes deleteUser(String id) {
        // 해당 유저가 존재하는지 확인
        if(this.findById(id).getStatus() != 200)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);

        try {
            userMapper.deleteUser(id);
            return DefaultRes.res(StatusCode.NO_CONTENT, ResponseMessage.DELETE_USER);
        } catch (Exception e) {
            //Rollback
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }

    }
}
