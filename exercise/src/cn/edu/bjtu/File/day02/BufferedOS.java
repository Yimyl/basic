package cn.edu.bjtu.File.day02;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOS {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));
        bos.write("abcd你有点读".getBytes(),2,11);
        bos.close();
    }
}
