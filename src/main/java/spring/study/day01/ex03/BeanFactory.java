// 결합도 낮추기 - 디자인 패턴 이용
package spring.study.day01.ex03;

public class BeanFactory {
  public Object getBean(String beanName) {
    if (beanName.equals("samsung")) {
      return new SamsungTV();
    } else if (beanName.equals("lg")) {
      return new LgTV();
    }
    return null;
  }
}
