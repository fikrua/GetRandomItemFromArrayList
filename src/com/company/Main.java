package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> randValue = new ArrayList<Integer>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int value=0;

        for(int i =0; i<20; i++){
            int t=rand.nextInt(50);
            randValue.add(t);
        }
        System.out.println("ArrayList: "+randValue);

        System.out.print("value to find: ");
        int findValue = scan.nextInt();
        for (int i = 0; i<randValue.size();i++) {
            if (randValue.get(i) == findValue) {
                value++;
                System.out.printf("%d is in array list\n", findValue);
            }

        }
        System.out.println();
        int found = randValue.get(rand.nextInt(randValue.size()));
        System.out.println("the randomly found value is "+found);
    }
}
