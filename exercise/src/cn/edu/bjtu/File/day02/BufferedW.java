package cn.edu.bjtu.File.day02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedW {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("niu");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        System.out.println();
    }
}
