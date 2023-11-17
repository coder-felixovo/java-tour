package designpattern.creationalpattern.simplefactory;

/**
 * 具体产品角色
 * 铅笔
 */
public class Pencil implements Pen {
    @Override
    public void write() {
        System.out.println("使用铅笔书写");
    }
}
