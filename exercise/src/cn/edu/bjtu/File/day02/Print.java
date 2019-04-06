package cn.edu.bjtu.File.day02;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Print {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("print.txt");
        ps.write(97);
        ps.println();
        ps.println(97);
        ps.close();
    }
}
