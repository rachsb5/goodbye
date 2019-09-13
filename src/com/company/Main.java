package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Goodbye");
        //double x = Math.random();   // random number [0.0,1.0)
        //double x = Math.random()*10;   // random double [0.0,10.0)
        //int x = (int)(Math.random()*10);  //random int [0,10)
        //int x = (int)(Math.random()*20);
        int x = (int)(Math.random()*10 + 10);  // random int [10,20)
        System.out.println(x);
    }
}