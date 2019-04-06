package cn.edu.bjtu.File.day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOS {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(f,true);
        fos.write("里\n".getBytes());
        fos.close();
    }
}
