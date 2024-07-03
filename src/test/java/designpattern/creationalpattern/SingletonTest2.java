package designpattern.creationalpattern;

import designpattern.creationalpattern.singleton.Singleton2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 序列化反破坏单例模式测试
 */
public class SingletonTest2 {
    private static Singleton2 readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("txt/object.txt")));
        Singleton2 singleton2 = (Singleton2) inputStream.readObject();
        return singleton2;
    }

    private static void writeObject(Singleton2 singleton2) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("txt/object.txt")));
        outputStream.writeObject(singleton2);
    }

    public static void main(String[] args) throws Exception {
        Singleton2 singleton2 = Singleton2.getInstance();
        writeObject(singleton2);
        Singleton2 s1 = readObject();
        Singleton2 s2 = readObject();
        System.out.println(singleton2 == s1); // false
        System.out.println(s1 == s2); // false
    }
}
