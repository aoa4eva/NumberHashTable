package com.company;

import java.io.File;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String>aNumberMap = new HashMap();

        do{

        }while(askForInput(aNumberMap));
        System.out.println("These are the values in your hash map:");


        for(Integer aKey: aNumberMap.keySet())
        {
            System.out.println(aKey);
            System.out.println(aNumberMap.get(aKey));
        }





    }

    public static boolean askForInput(HashMap numberMap)
    {
        Scanner keyboard = new Scanner(System.in);
        Integer userInput=null;
        String numberValue;
        System.out.println("Enter a value to find a number for");

        try{
            userInput = keyboard.nextInt();
            keyboard.nextLine();
        }
        catch(Exception e)
        {
            System.out.println("Unable to interpret your input. ");
            return true;

        }
        if(numberMap.containsKey(userInput))
            System.out.println(userInput+" is "+numberMap.get(userInput));
        else
        {
            System.out.println("The number is not in the hash map. Please enter a value for it:");
            numberValue = keyboard.nextLine();
            numberMap.put(userInput,numberValue);
            System.out.println(userInput+" has been added to the hashmap as "+ numberValue);
        }

        System.out.println("Do you want to enter another value?");
        String getAnswer = keyboard.nextLine();
        if(getAnswer.equalsIgnoreCase("y"))
         return true;
        else return false;
    }



}
