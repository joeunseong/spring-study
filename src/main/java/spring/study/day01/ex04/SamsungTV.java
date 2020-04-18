package spring.study.day01.ex04;

public class SamsungTV implements TV {
  public SamsungTV() {
    System.out.println("==> SamsungTV Constructor");
  }

  @Override
  public void powerOn() {
    System.out.println("SamsungTV :: powerOn()");
  }

  @Override
  public void powerOff() {
    System.out.println("SamsungTV :: powerOff()");
  }

  @Override
  public void volumeUp() {
    System.out.println("SamsungTV :: volumeUp()");
  }

  @Override
  public void volumeDown() {
    System.out.println("SamsungTV :: volumeDown()");
  }
}
