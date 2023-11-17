package designpattern.creationalpattern.abstractfactory;

/**
 * 具体产品
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("Python video");
    }
}
