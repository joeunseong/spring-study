package spring.study.day01.ex02;

public class TVUser {
  public static void main(String[] args) {
    TV tv = new SamsungTV();
    tv.powerOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.powerOff();
  }
}
