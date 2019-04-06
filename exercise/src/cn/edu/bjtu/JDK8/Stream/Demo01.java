package cn.edu.bjtu.JDK8.Stream;

import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
//        LinkedHashSet s = new LinkedHashSet();
        Stream<String> s = Stream.of("zzj","star","hh");
        s.limit(2).forEach(a-> System.out.println(a));
    }
}
