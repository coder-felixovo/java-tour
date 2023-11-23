package designpattern.structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件（Composite）角色  大学
 */
public class University extends Component {
    // List存放的是学院的信息
    List<Component> components = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    protected void add(Component component) {
        components.add(component);
    }

    protected void remove(Component component) {
        components.remove(component);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("名称：" + getName() + " 描述：" + getDes());
        for (Component coms : components) {
            coms.print();
        }
    }
}
