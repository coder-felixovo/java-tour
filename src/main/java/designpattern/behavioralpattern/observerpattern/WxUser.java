package designpattern.behavioralpattern.observerpattern;

/**
 * Concrete Observer 具体观察者
 */
public class WxUser implements Observer{
    private String name;

    public WxUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
