package cn.edu.bjtu.API.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Coll {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();

        System.out.println(c1);
        boolean b = c1 .add("zzj");
        System.out.println(b);
        c1.add("star");
        c1.add("zzj");
        System.out.println(c1);

        c1.remove("zzj");
        System.out.println(c1);
        System.out.println(c1.contains("zzj"));
        System.out.println(c1.isEmpty());
        System.out.println(c1.size());
        Object[] arr = c1.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
