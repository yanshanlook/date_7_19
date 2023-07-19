package ncu.chap12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>();
        set.add(-5);
        set.add(-7);
        set.add(10);
        set.add(6);
        set.add(3);
        Iterator<Integer> it=set.iterator();//创建Iterator迭代器对象
        System.out.println("Set集合中的元素： ");
        int arr[]=new int[set.size()];
        for(int i=0;i<set.size();i++){
            arr[i]=it.next();
        }
        for(int i=0;i<set.size();i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("降序排列后:");
        for(int i=0;i<set.size()-1;i++){
            for(int j=set.size()-1;j>i;j--){
                if(arr[j]>arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
            }

        }
        for(int i=0;i<set.size();i++){
            System.out.print(arr[i]+" ");
        }

    }
}
