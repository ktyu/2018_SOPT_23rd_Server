package org.sopt.report5.api;

import org.sopt.report5.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.sopt.report5.model.DefaultRes.FAIL_DEFAULT_RES;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public ResponseEntity getCurrentTime() {
        return new ResponseEntity<>(userService.getCurrentTime(), HttpStatus.OK);
    }



    @GetMapping("/users")      // param의 required 기본값은 true 이고 두가지 방법 모두 사용가능. 뭐가 더 좋은지?
    public ResponseEntity getUserList(@RequestParam(value = "name", required = false) final String name,
                                      @RequestParam("part") final Optional<String> part) {

        // name 과 part 모두 입력되지 않은 경우
        if((name == null) && !(part.isPresent()))
            return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);

        // name만 입력된 경우
        else if(!(part.isPresent())) {
            return new ResponseEntity<>(userService.findByName(name), HttpStatus.OK);
        }

        // part만 입력된 경우
        else if(name == null) {
            return new ResponseEntity<>(userService.findByPart(part.get()), HttpStatus.OK);
        }

        // 키 값이 잘못된 경우
        return new ResponseEntity<>(FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/users/{user_id}")
    public ResponseEntity getUserByIdx(@PathVariable(value = "user_id") final String id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }


}
