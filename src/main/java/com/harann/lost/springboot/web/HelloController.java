package com.harann.lost.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // json 반환하는 컨트롤러로 변환
public class HelloController {

    @GetMapping("/hello")   //GET 요청받는 메소드 생성
    public String hello() {
        return "hello";
    }
}
