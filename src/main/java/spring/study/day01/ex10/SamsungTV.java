package spring.study.day01.ex10;

public class SamsungTV implements TV {

  private SonySpeaker speaker;

  public SamsungTV() {
    System.out.println("==> SamsungTV Constructor");
  }

  @Override
  public void volumeUp() {
    speaker = new SonySpeaker();
    speaker.volumeUp();
  }

  @Override
  public void volumeDown() {
    speaker = new SonySpeaker();
    speaker.volumeDown();
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
}
