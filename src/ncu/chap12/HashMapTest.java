package ncu.chap12;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();//
        map.put("ISBN-978654","Java从入门到精通");
        map.put("ISBN-978361","Android从入门到精通");
        map.put("ISBN-978893","21天学习Android");
        map.put("ISBN-978756","21天学Java");
        Set<String>set=map.keySet();//构建Map集合中所有的key的Set集合
        Iterator<String>it=set.iterator();
        System.out.println("key值： ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        Collection<String>coll=map.values();//构建map集合中所有value值的集合
        it=coll.iterator();
        System.out.print("\nvalue值： ");
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
