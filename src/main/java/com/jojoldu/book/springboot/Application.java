package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//스프링 부트의 자동설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정한다
//@SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트 최상단에 위치해야한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //내장 WAS를 실행, 이렇게되면 항상 서버에 톰켓을 설치할 필요가 없어지고, 스프링부트로 만들어진 JAR파일로 실행하면된다.
        SpringApplication.run(Application.class, args);

    }
}
