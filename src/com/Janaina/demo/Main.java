package com.Janaina.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Uppgift 4
        boolean isPlaying = true;


        do {

            System.out.println("Type 1 to play, and 'stop' to exit!");
            String swstring = sc.nextLine();

            switch(swstring){
                case "stop":
                    isPlaying = false;
                    break;
                case "1":
                    System.out.println("Throwing!");
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }

        } while (isPlaying);

    }

}
