package cn.edu.bjtu.API.day03;

import java.util.Comparator;

public class Demo02 implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
    }
}
