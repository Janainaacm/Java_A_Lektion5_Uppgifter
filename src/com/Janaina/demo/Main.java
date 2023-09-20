package com.Janaina.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Uppgift 3
        boolean isPlaying = true;

        do {

            System.out.println("Say the magic word");
            String magicWord = sc.nextLine();

            if (magicWord.equals("stop")){
                isPlaying = false;
            }


        } while (isPlaying);


    }

}
