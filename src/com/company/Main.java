package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Declare varianles
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int valueSearch;
        int searchIndex;
        int count =0;


        //Initialize the array using the loop
        for (int i = 0; i < 50; i++) {
            numbers.add(rnd.nextInt(49) + 1);
        }

        System.out.print(numbers);

        //Prompt user for number
        System.out.print("\nValue to find: ");
        valueSearch = input.nextInt();

        //Binary search
        Collections.sort(numbers);
        searchIndex = Collections.binarySearch(numbers, valueSearch);
        if(searchIndex < 0){
            System.out.println(valueSearch + " is not in the ArrayList.");
        }
        else{
            for(int j = 0; j<numbers.size(); j++){
                if(numbers.get(j) == valueSearch){
                    count++;
                }
            }
            System.out.print("The value appears "+ count + " times");
        }

    }
}
