package io;

import java.io.*;

public class Demo4 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("txt/greet.txt")) {
            fileWriter.write("你好，我是Java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
