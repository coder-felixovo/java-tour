package basics.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        // 泛型引入示例
        List list = new ArrayList();
        list.add("hello world");
        list.add(100);


        for (int i = 0; i < list.size(); i++) {
            // 下面这行语句在第二项会抛出错误
            // java.lang.Integer cannot be cast to java.lang.String
            String item = (String) list.get(i);

            System.out.println(item);
        }

        // ArrayList可以存放任意类型数据，但未了避免出现上述情况，通常应统一类型
        List<String> list1 = new ArrayList<String>();
        list1.add("hello world");

        // 下面这行语句在编译阶段就会报错
//        list1.add(100);
    }
}
