package org.sopt.seminar3.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.seminar3.model.DefaultRes;
import org.sopt.seminar3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity getAllusers() {
        log.info("get All Users");
//        DefaultRes defaultRes = new DefaultRes(HttpStatus.OK, "User가 없습니다");
//        return new ResponseEntity<>(defaultRes, HttpStatus.OK);
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

}
