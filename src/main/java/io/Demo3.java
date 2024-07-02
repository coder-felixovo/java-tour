package io;

import java.io.FileReader;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("txt/fruit.txt")) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
