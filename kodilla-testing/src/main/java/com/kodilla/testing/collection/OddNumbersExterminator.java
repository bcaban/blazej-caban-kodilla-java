package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {


        ArrayList<Integer> evenList = new ArrayList<>();

        for (int a : numbers) {
            if (a % 2 == 0) {
                evenList.add(a);
            }
        }


        return evenList;
    }
}
