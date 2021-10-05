package com.harann.lost.springboot.web;
import com.harann.lost.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // json 반환하는 컨트롤러로 변환
public class HelloController {

    @GetMapping("/hello")   //GET 요청받는 메소드 생성
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name,     //외부에서 api 로 넘긴 파라미터 가져옴
                                             @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
