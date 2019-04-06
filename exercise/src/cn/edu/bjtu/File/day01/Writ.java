package cn.edu.bjtu.File.day01;

import java.io.FileWriter;
import java.io.IOException;

public class Writ {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
