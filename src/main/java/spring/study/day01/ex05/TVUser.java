package spring.study.day01.ex05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
  public static void main(String[] args) {
    System.out.println("1. 스프링 컨테이너 구동");
    AbstractApplicationContext factory =
        new GenericXmlApplicationContext("spring/study/day01/ex05/applicationContext.xml");

    System.out.println("----------------------------------");
    System.out.println("2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)");
    TV tv = (TV) factory.getBean("tv");
    tv.powerOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.powerOff();

    System.out.println("-----------------------------------");
    System.out.println("3. Spring 컨테이너 종료");
    factory.close();
  }
}

