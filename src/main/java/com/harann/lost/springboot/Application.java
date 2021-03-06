// 프로젝트의 main class, 프로젝트의 최상단에 위치
package com.harann.lost.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing  // JPA Auditing 활성화
@SpringBootApplication
public class Application {
    // SpringApplication.run 내장 WAS 실행
    public static void main(String[] args) { SpringApplication.run(Application.class, args); }
}
