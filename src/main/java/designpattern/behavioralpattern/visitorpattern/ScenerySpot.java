package designpattern.behavioralpattern.visitorpattern;

/**
 * 抽象元素 Element --- 场馆
 */
public interface ScenerySpot {
    // 接待访问者
    void accept(Visitor visitor);
    // 票价，单位分
    Integer ticketRate();
}
