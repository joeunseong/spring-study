package spring.study.day01.ex11;

public class SamsungTV implements TV {

  private SonySpeaker speaker;

  public SamsungTV() {
    System.out.println("==> SamsungTV Constructor(1)");
  }

  public SamsungTV(SonySpeaker speaker) {
    System.out.println("==> SamsungTV Constructor(2)");
    this.speaker = speaker;
  }

  @Override
  public void volumeUp() {
    speaker.volumeUp();
  }


  @Override
  public void volumeDown() {
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
