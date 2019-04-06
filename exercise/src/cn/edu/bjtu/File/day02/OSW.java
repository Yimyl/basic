package cn.edu.bjtu.File.day02;

import java.io.*;

public class OSW {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test2.txt"),"gbk");
        osw.write("你还好");
        osw.close();
    }
}
