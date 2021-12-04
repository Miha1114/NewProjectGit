package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    // List a random number

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 1; 30 >= i; i++) {
            numbersList.add(i);
        }
        System.out.print("The numbers stored in the list are: ");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }
        Random random = new Random();
        randomInt = numbersList;

    }
}