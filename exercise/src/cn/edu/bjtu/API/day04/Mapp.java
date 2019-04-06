package cn.edu.bjtu.API.day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapp {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        HashMap m = (HashMap)map;
        //m.put()
        System.out.println(map.put("zzj","star"));
        System.out.println(map.put("zzj","star2"));
        //System.out.println(map.remove(null));
        //System.out.println(map.remove("zzj"));
        System.out.println(map.put(null,"star"));
        //System.out.println(map.get(null));
        Set<String> s = map.keySet();
        for(String key:s){
            System.out.println(map.get(key));
        }
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            //System.out.println(it.next());
            System.out.println(map.get(it.next()));
        }
        for(Map.Entry e:map.entrySet()){
            System.out.println(e.getKey()+ ":"+e.getValue());
        }
        Iterator<Map.Entry<String,String>> it2 = map.entrySet().iterator();
        while(it2.hasNext()){
            Map.Entry<String,String> e = it2.next();
            System.out.println(e.getKey()+ "=" + e.getValue());
        }
    }
}
