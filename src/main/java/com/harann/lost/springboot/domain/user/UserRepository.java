//2021.11.12
//User 의 CRUD 담당 인터페이스
package com.harann.lost.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);   //소셜 로그인으로 반환되는 값 중 email 중복 확인
}
