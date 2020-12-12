package com.CodingNinJas.OOPsUser;

import com.CodingNinJas.OOPs.DynamicArray;

public class DynamicUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();

        for(int i =5 ;i<100;i++){
            d.add(i);
        }

        for(int i =0;i<100;i++){
            System.out.println(d.get(i));
        }

        while(!d.isEmpty()){
            System.out.println(d.size());
            d.removeLast();
        }
    }
}
