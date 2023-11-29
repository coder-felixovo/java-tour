package designpattern.behavioralpattern.visitorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构 Object Structure --- 动物园类
 */
public class Zoo {
    // 场馆集合
    private List<ScenerySpot> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (ScenerySpot scenerySpot : list) {
            scenerySpot.accept(visitor);
        }
    }

    public void add(ScenerySpot scenerySpot) {
        list.add(scenerySpot);
    }

    public void remove(ScenerySpot scenerySpot) {
        list.remove(scenerySpot);
    }
}
