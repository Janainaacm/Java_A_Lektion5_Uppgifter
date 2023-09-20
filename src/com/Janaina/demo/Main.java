package com.Janaina.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Uppgift 2
        System.out.println("What number do you want to loop");
        int loopNumber = sc.nextInt();

        for (int i = 0; i < loopNumber; i++) {
            System.out.println(i);
        }


    }

}
