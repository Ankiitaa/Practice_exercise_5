/*Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

 */



package com.stackroute;
import java.util.*;
public class Repetition {
   public Map<String,Boolean> wordRepeat(String[] strings){
       int count=1;
       Map<String,Boolean> map = new HashMap<String, Boolean>();
       for(String s:strings){
           if(!map.containsKey(s))
               map.put(s,false);
           else{
               count++;
               if(count>1)
                   map.put(s,true);
               else
                   map.put(s,false);
           }
       }
       return map;
   }
}
