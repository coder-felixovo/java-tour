package designpattern.creationalpattern;

import designpattern.creationalpattern.builder.Computer;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel", "Samsung")
                .setDisplay("Samsung 24inch")
                .setKeyBoard("Logitech")
                .setUsbCount(3)
                .build();
        System.out.println(computer.toString());
    }
}
