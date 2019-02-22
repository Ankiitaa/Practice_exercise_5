package com.stackroute;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapValue {
    public Map mapValueModify(Map value){
        Set set = value.keySet();

        Object[] objects = new Object[2];
        int i=0;


        Iterator itr = set.iterator();
        while (itr.hasNext()){
            objects[i]=itr.next();
            i++;
        }

        Object newValue = value.get(objects[0]);
        value.put(objects[0],"");
        value.put(objects[1],newValue);


        return value;

    }
}