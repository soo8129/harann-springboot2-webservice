package com.harann.lost.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id     //해당 테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //PK 생성규칙, auto_increment
    private Long id;

    @Column(length = 500, nullable = false)     //굳이 선언 안해도 해당 클래스의 필드는 모두 칼럼이지만 변경이 필요할 경우에 선언
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    //빌더클래스 생성, 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
