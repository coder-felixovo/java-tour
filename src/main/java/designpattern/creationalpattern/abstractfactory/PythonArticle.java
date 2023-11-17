package designpattern.creationalpattern.abstractfactory;

/**
 * 具体产品
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("Python article");
    }
}
