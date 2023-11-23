package designpattern.structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件（Composite）角色  学院
 */
public class College extends Component {
    // List存放专业信息
    List<Component> components = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Component component) {
        components.add(component);
    }

    @Override
    protected void remove(Component component) {
        components.add(component);
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
