//record item(String name, int price) -> 파라미터를 private final로 정의됨
//빈 -> 스프링 컨테이너가 생성하고 관리하는 객체



package me.minjoonkwak.springbootdeveloper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootDeveloperApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}

