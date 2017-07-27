package com.cys.lock;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String str=sc.nextLine();
       /* int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }*/
       String str="abaababa";
        int maxStrStr = getMaxStrStr(str);
      //  System.out.println(maxStrStr);

    }
    public static int   getMaxStrStr(String str){
        if(str==null)
            return 0;
        char[] chars = str.toCharArray();
        int len=str.length();
        int temp=0;
        int removelen;
        for(int i=0;i<len;i++){
            removelen=len-i-1;
            if(removelen>0&&(removelen%2)==0){
               int j=0;
                    while((chars[j]==chars[(removelen/2)+j])&&j<(removelen/2)){
                        j++;
                        if(j==(removelen/2)){
                            temp=removelen;
                            break;
                        }
                        continue;
                    }
            }
            if(temp>0){
                break;
            }
        }

     return  temp;
    }
    public static int getStrStr(String str){
        int len=str.length();
        char[] chars = str.toCharArray();
        HashSet<Character> hashSet=new HashSet<Character>();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char ch:chars){
            if(hashMap.containsKey(ch)){
                Integer num = hashMap.get(ch);
                num++;
                hashMap.put(ch,num);
            }else {
                hashMap.put(ch,1);
            }
            hashSet.add(ch);
        }

        for(char ch:chars){
        }
        if(hashSet.size()==chars.length){
            return chars.length;
        }


        return len;
    }
}
