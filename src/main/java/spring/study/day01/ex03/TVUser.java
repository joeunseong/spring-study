package spring.study.day01.ex03;

public class TVUser {
  public static void main(String[] args) {
    BeanFactory factory = new BeanFactory();
    // args[0]에 "samsung" 또는 "lg" 전달
    // TVUser.java -> [Run As] -> [Run Configurations] -> [Arguments]
    TV tv = (TV) factory.getBean(args[0]);
    tv.powerOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.powerOff();
  }
}
