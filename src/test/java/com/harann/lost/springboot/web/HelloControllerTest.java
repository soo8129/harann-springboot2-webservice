package com.harann.lost.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)    //스프링부트테스트와 junit 연결자 역할
@WebMvcTest(controllers = HelloController.class)    //Spring MVC 에 집중할 수 있는 어노테이션
public class HelloControllerTest {

    @Autowired  //빈 주입
    private MockMvc mvc;    //웹 api 테스트할 때 사용, MVC 테스트의 시작점, 이 클래스를 통해 get, post 테스트

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))  //MockMvc 통해 /hello 주소로 get 요청, 체이닝 지원되므로 아래에 이어 선언 가능
                .andExpect(status().isOk()) //mvc.perform 의 결과를 검증, 헤더의 status 검증, ok(=200)인지 검증
                .andExpect(content().string(hello));    //mvc.perform 의 결과 검증, 응답본문의 내용이 hello 인지 검증
    }
}
