package designpattern.structuralpattern.compositepattern;

/**
 * 抽象构建（Component）角色
 */
public abstract class Component {
    private String name;
    private String des;

    public Component(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();
}
