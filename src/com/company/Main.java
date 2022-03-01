package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int USER_INPUT_NUMBERS = 4;

        Double[] array = new Double[USER_INPUT_NUMBERS];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + USER_INPUT_NUMBERS + " numbers: ");

        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
        input.close();

        List<Double> myNumbers = Arrays.asList(array);
        Collections.reverse(myNumbers);

        System.out.println("The array in reverse: ");
        System.out.println(myNumbers);

    }
}
