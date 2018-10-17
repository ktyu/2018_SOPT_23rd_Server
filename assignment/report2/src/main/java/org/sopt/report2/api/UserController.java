package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {

    // 회원정보를 저장할 정적 변수(연결 리스트)
    private final static List<User> userList = new LinkedList<>();


    /**
     * 현재 시간 출력
     * @return 현재 시간 String
     */
    @GetMapping("/")
    public String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }



    /**
     * 회원 리스트 조회 (모든 or 이름으로 or 파트로)
     * @return 회원 리스트
     */
    @GetMapping("/users")
    public List<User> getUserList(@RequestParam(value = "name", required = false) final String name,
                                  @RequestParam(value = "part", required = false) final String part) {


        //입력된 키가 없으면 전체 리스트 리턴
        if(name == null && part == null)
            return userList;


        //name 키 값이 입력된 경우 필터링
        else if(name != null && part == null) {
            LinkedList<User> selectedList = new LinkedList<>();

            for (final User obj : userList) {
                if(obj.getUserName().equals(name)) {
                    selectedList.add(obj);
                }
            }

            if(selectedList.size() == 0)
                throw new NumberFormatException("없습니다");

            return selectedList;
        }

        //part 키 값이 입력된 경우 필터링
        else if(name == null && part != null) {
            LinkedList<User> selectedList = new LinkedList<>();

            for (final User obj : userList) {
                if(obj.getUserPart().equals(part)) {
                    selectedList.add(obj);
                }
            }

            if(selectedList.size() == 0)
                throw new NumberFormatException("없습니다");


            return selectedList;
        }


        // 기타 예외
        throw new NumberFormatException("name과 part중 하나의 키만 입력하세요");
    }



    /**
     * 회원 정보를 idx로 검색
     * @return User객체
     */
    @GetMapping("/users/{user_idx}")
    public User getUserByIdx(@PathVariable(value = "user_idx") final int idx) {

        // idx로 검색
        for (final User obj : userList) {
            if(obj.getUserIdx() == idx)
                return obj;
        }

        // 없으면 예외처리
        throw new NumberFormatException("없습니다");
    }


    /**
     * 회원 정보 저장
     * @return void
     */
    @PostMapping("/users")
    public void makeUser(@RequestBody final User user) {
        userList.add(user);
    }


    /**
     * 회원 정보 수정
     * @return void
     */
    @PutMapping("/users/{user_idx}")
    public void modifyUser(@PathVariable(value = "user_idx") final int idx,
                             @RequestBody final User user) {

        // idx로 검색해서 찾으면 지우고 새 정보 삽입
        for (User obj : userList) {
            if(obj.getUserIdx() == idx) {
                userList.remove(obj);
                userList.add(user);
                break;
            }
        }
    }

    /**
     * 회원 정보 삭제
     * @return void
     */
    @DeleteMapping("/users/{user_idx}")
    public void deleteUser(@PathVariable(value = "user_idx") final int idx) {

        // idx로 검색해서 찾으면 지우기
        for (User obj : userList) {
            if(obj.getUserIdx() == idx) {
                userList.remove(obj);
                break;
            }
        }
    }

    /**
     * 이 컨트롤러 내에서 발생하는 모든 Number Format 예외를 처리한다
     * */
    @ExceptionHandler(value = NumberFormatException.class)
    public String nfeHandler(NumberFormatException e){
        return e.getMessage();
    }
}
