package com.javaee.basis;

import java.util.HashMap;
import java.util.Set;

public class Node {

    int x;
    int y;
    int step;
    Node(int x,int y,int step){
        this.x=x;
        this.y=y;
        this.step=step;
    }

    public static void main (String[] args) throws Exception {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(5,1);
        map.put(4,2);
        map.put(6,3);
        map.put(8,4);
        map.put(7,5);

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(map.get(key));
        }


    }
}
