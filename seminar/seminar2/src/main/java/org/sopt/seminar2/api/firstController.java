package org.sopt.seminar2.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class firstController {

    @GetMapping("1")
    public String hello() {
        return "Hello world! from 1";
    }

//    @RequestMapping(method = RequestMethod.GET, value = "")
//    public String hello2() {
//        return "Nice to meet you!";
//    }


    @GetMapping("/get1")
    public String get1() {
        System.out.println("get1 called!");
        return "get1";
    }

    @GetMapping("/get1/유기태")
    public String get1more() {
        return "Here is get1/유기태";
    }


    @GetMapping("/name/{name1}")
    public String getName(@PathVariable(value = "name1", required = true) final String name) {
        return name;
    }




    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part1", defaultValue = "partdefault") final String part) {
        return part;
    }

    @GetMapping("/info")
    public String getPart2(
            @RequestParam(value = "name", required = false) final String name,
            @RequestParam(value = "type", defaultValue = "yb") final String type) {
        return name + "이고" + type + "입니다";
    }

    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num) { // 같은 키값이 여러개 있을때 배열로 받음
        int sum  = 0;
        for(int i : num) {
            sum += i;
        }
        return sum;
    }


}
