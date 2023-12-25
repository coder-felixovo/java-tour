package basics.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<Integer> integerList = new ArrayList<Integer>();

        Class classStringArrayList = arrayList.getClass();
        Class classIntegerList = integerList.getClass();

        System.out.println(classStringArrayList.equals(classIntegerList)); // true

        /*
            在编译过程中，正确检验泛型结果后，会将泛型相关信息擦出，也就是在编译后会去泛型化，意味着泛型信息不会进入到运行时阶段。
         */
    }
}
