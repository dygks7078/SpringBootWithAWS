package com.yogo.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//메인 클래스
@SpringBootApplication              //스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동으로 설정
@EnableJpaAuditing                  // P 122 JPA Aditing 활성화
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
        //내장 WAS(Web Application Server)를 실행
    }

}