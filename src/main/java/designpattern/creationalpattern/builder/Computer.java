package designpattern.creationalpattern.builder;

/**
 * 建造者模式
 */
public class Computer {
    private final String cpu;
    private final String ram;
    private final int usbCount;
    private final String keyboard;
    private final String display;

    // Computer类的private构造函数，参数为Builder类型
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    // 静态内部类Builder
    public static class Builder {
        private String cpu;
        private String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        // Builder类的构造函数的参数为Computer类的必填参数
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // 可选参数则创建相应的setter函数
        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyBoard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        // build方法，创建Computer实例并返回
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
