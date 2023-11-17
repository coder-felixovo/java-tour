package designpattern.creationalpattern.abstractfactory;

/**
 * 具体产品
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("Java article");
    }
}
