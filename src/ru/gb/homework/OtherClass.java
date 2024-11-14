package ru.gb.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherClass {

    public static List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

    /**
     * метод добавления элемента
     * @param num - число, которое добаляем
     * @return
     */
    public static List<Integer> addElement(int num){
        list.add(num);
        return list;
    }

    /**
     * метод получения значения
     * элемента по индексу
     * @param index
     * @return
     */
    public static int getElement(int index){
       return list.get(index);
    }

    /**
     * метод получения размера списка
     * @return
     */
    public static int listSize(){
        return list.size();
    }


}
