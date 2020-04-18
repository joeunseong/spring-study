package spring.study.day01.ex09;

public class SamsungTV implements TV {
  public SamsungTV() {
    System.out.println("==> SamsungTV Constructor");
  }

  public void initMethod() {
    System.out.println("객체 초기화 작업 처리 코드 수행중...");
  }

  public void destroyMethod() {
    System.out.println("객체 삭제 전에 처리할 코드 수행중...");
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
