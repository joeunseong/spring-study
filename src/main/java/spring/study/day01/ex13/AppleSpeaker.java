package spring.study.day01.ex13;

public class AppleSpeaker implements Speaker {
  public AppleSpeaker() {
    System.out.println("AppleSpeaker Constructor");
  }

  @Override
  public void volumeUp() {
    System.out.println("AppleSpeaker :: volumeUp()");
  }

  @Override
  public void volumeDown() {
    System.out.println("AppleSpeaker :: volumeDown()");
  }

}
