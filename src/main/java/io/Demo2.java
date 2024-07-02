package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("txt/greet.txt")) {
            byte[] byteArr = "Hello Java".getBytes();
            output.write(byteArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
