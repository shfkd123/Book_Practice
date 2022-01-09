package com.practice.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); //내장 WAS 실행 ㅈ
    }
}
