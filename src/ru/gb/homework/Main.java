package ru.gb.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int number = 5;

        View.printList(OtherClass.addElement(number), number);

        View.printElement(2, OtherClass.getElement(2));

        View.printSize(OtherClass.listSize());
    }
}
