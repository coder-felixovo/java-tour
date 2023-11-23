package designpattern.structuralpattern.compositepattern;

import org.junit.Test;

public class CompositePatternTest {
    @Test
    public void test1() {
        Component university = new University("清华大学", "Top2");

        Component college1 = new College("信息工程学院", "计算机、通信");
        Component college2 = new College("建设工程学院", "土木、测绘");

        university.add(college1);
        university.add(college2);

        college1.add(new Department("计算机科学与技术", "aaa"));
        college1.add(new Department("软件工厂", "bbb"));

        college2.add(new Department("土木", "ccc"));
        college2.add(new Department("测绘", "ddd"));

        university.print();
    }
}
