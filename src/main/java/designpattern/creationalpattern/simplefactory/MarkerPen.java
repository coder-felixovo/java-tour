package designpattern.creationalpattern.simplefactory;

/**
 * 具体产品角色
 * 马克笔
 */
public class MarkerPen implements Pen{
    @Override
    public void write() {
        System.out.println("使用马克笔书写");
    }
}
