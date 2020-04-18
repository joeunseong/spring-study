package spring.study.day01.ex04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
  public static void main(String[] args) {
    System.out.println("1. 스프링 컨테이너 구동");
    AbstractApplicationContext factory =
        new GenericXmlApplicationContext("spring/study/day01/ex04/applicationContext.xml");
    // printBeans(factory);
  }

}

