package spring.study.day01.ex13;

public class SonySpeaker implements Speaker {
  public SonySpeaker() {
    System.out.println("SonySpeaker Constructor");
  }

  @Override
  public void volumeUp() {
    System.out.println("SonySpeaker :: volumeUp()");
  }

  @Override
  public void volumeDown() {
    System.out.println("SonySpeakr :: volumeDown()");
  }

}
