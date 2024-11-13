package ru.gb.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherClass {

    public static List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    public static List<Integer> addElement(int num){
        list.add(num);
        return list;
    }

    public static int getElement(int index){
       return list.get(index);
    }

    public static int listSize(){
        return list.size();
    }


}
