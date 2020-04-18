package spring.study.day01.ex06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
  public static void main(String[] args) {
    System.out.println("1. 스프링 컨테이너 구동");
    AbstractApplicationContext factory =
        new GenericXmlApplicationContext("spring/study/day01/ex06/applicationContext.xml");
    printBeans(factory);
  }

  private static void printBeans(AbstractApplicationContext appCtx) {
    String[] beanNames = appCtx.getBeanDefinitionNames();
    for (String beanName : beanNames) {
      System.out.printf(
          String.format("%s--->%s\n", beanName, appCtx.getBean(beanName).getClass().getName()));
    }
    System.out.println();

  }
}

