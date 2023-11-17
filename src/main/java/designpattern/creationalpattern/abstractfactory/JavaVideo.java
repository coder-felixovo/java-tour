package designpattern.creationalpattern.abstractfactory;

/**
 * 具体产品
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("Java video");
    }
}
