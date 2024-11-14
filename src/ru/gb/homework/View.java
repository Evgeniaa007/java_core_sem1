package ru.gb.homework;

import java.util.ArrayList;
import java.util.List;

public class View {
    /**
     * печать массива
     * и элемента, который был в него добавлен
     * @param list
     * @param num
     */
    public static void printList(List<Integer> list, int num){
        for(int el : list){
            System.out.println(el);
        }
        System.out.println(num + " успешно добален в массив");
    }

    /**
     * вывод значения элемента списка (по индексу)
     * @param index
     * @param num
     */
    public static void printElement(int index, int num){
        System.out.println("По индексу " + index + " находится число " + num);
    }

    /**
     * вывод значения размера списка
     * @param size
     */
    public static void printSize(int size){
        System.out.println("Размер массива: " + size);
    }


}
