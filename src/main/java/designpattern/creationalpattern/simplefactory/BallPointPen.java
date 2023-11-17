package designpattern.creationalpattern.simplefactory;

/**
 * 具体产品角色
 * 圆珠笔类
 */
public class BallPointPen implements Pen {
    @Override
    public void write() {
        System.out.println("使用圆珠笔书写");
    }
}
