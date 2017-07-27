package MyLinkedList;

import java.util.Set;
import java.util.TreeSet;

public class JingDngTest {
    public static void main(String[] args) {
   JingDngTest jingDngTest=new JingDngTest();
   int []arr1={1,3,2,5,7};
   int []arr2={10,2,4,5,7};
   jingDngTest.method(arr1.length,arr2.length,arr1,arr2);
    }
    public void method(int m,int n,int[]arr1,int []arr2){
        Set<Integer> hs1=new TreeSet<>();
        Set<Integer> hs2=new TreeSet<>();
         for (int i=0;i<m;i++){
             hs1.add(arr1[i]);
         }
         for(int i=0;i<n;i++){
             hs2.add(arr2[i]);
         }
         hs1.addAll(hs2);
    hs1.forEach(x->{
        System.out.println(x);
    });

    }
}
