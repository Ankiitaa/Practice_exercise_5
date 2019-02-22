/*Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}

 */



package com.stackroute;

import java.util.*;

public class StringCount {
    public Map<String, Integer> stringCount(String string){
        Map<String,Integer> map = new HashMap<String, Integer>();
        String[] result = string.split("[\\W+]");
        for(String s:result){
            if(!map.containsKey(s))
                map.put(s,1);
            else{
                int count = map.get(s);
                map.put(s,count+1);
            }
        }
        return map;
    }
}
