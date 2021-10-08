// db 업데이트 시간 자동생성
package com.harann.lost.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   //JPA 클래스들이 BaseTimeEntity 상속할 경우 필드를 createdDate, modifiedDate 도 칼럼으로 인식
@EntityListeners(AuditingEntityListener.class)  //BaseTimeEntity 클래스에 Auditing 기능을 포함
public class BaseTimeEntity {

    @CreatedDate    //Entity 생성후 저장시간 자동저장
    private LocalDateTime createdDate;

    @LastModifiedDate   //Entity 조회후 값 변경시간 자동저장
    private LocalDateTime modifiedDate;
}
