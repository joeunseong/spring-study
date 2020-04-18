package spring.study.day01.ex13;

public class SamsungTV implements TV {

  private Speaker speaker;
  int price;

  public SamsungTV() {
    System.out.println("==> SamsungTV Constructor(1)");
  }

  public SamsungTV(Speaker speaker) {
    System.out.println("==> SamsungTV Constructor(2)");
    this.speaker = speaker;
  }

  public SamsungTV(Speaker speaker, int price) {
    System.out.println("==> SamsungTV Constructor(3)");
    this.speaker = speaker;
    this.price = price;
  }

  public SamsungTV(int price, Speaker speaker) {
    System.out.println("==> SamsungTV Constructor(4)");
    this.speaker = speaker;
    this.price = price;
  }

  public void initMethod() {
    System.out.println("객체 초기화 작업 처리 코드 수행중...");
  }

  public void destroyMethod() {
    System.out.println("객체 삭제 전에 처리할 코드 수행중...");
  }

  @Override
  public void powerOn() {
    System.out.println("SamsungTV :: powerOn() (가격:" + price + ")");
  }

  @Override
  public void powerOff() {
    System.out.println("SamsungTV :: powerOff()");
  }

  @Override
  public void volumeUp() {
    speaker.volumeUp();
  }


  @Override
  public void volumeDown() {
    speaker.volumeDown();
  }
}
