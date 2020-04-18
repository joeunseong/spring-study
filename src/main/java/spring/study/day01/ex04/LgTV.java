package spring.study.day01.ex04;

public class LgTV implements TV {
  @Override
  public void powerOn() {
    System.out.println("LgTV :: powerOn()");
  }

  @Override
  public void powerOff() {
    System.out.println("LgTV :: powerOff()");
  }

  @Override
  public void volumeUp() {
    System.out.println("LgTV :: volumeUp()");
  }

  @Override
  public void volumeDown() {
    System.out.println("LgTV :: volumeDown()");
  }
}
