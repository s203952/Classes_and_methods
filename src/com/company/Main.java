package com.company;

import static java.lang.Math.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;



public class Main {
    int size;
    int LOG = 0;
    static Scanner input = new Scanner(System.in);
    // this class stores the values of the different parts of the pyramid
    public Main(int size) {
        String fd;
        String l1;
        String l2;
        String l3;
        String l4;
        String l5;
    switch (size) {
        case 1:
            fd = "=";
            l1 = "#";
            System.out.println(l1);
            System.out.println(fd);
            break;
        case 2:
            fd = "===";
            l1 = "###";
            l2 = ".#.";
            System.out.println(l2);
            System.out.println(l1);
            System.out.println(fd);
            break;
        case 3:
            fd = "=====";
            l1 = "#####";
            l2 = ".###.";
            l3 = "..#..";
            System.out.println(l3);
            System.out.println(l2);
            System.out.println(l1);
            System.out.println(fd);
            break;
        case 4:
            fd = "=======";
            l1 = "#######";
            l2 = ".#####.";
            l3 = "..###..";
            l4 = "...#...";
            System.out.println(l4);
            System.out.println(l3);
            System.out.println(l2);
            System.out.println(l1);
            System.out.println(fd);
            break;
        case 5:
            fd = "=========";
            l1 = "#########";
            l2 = ".#######.";
            l3 = "..#####..";
            l4 = "...###...";
            l5 = "....#....";
            System.out.println(l5);
            System.out.println(l4);
            System.out.println(l3);
            System.out.println(l2);
            System.out.println(l1);
            System.out.println(fd);
            break;
        default:
            System.out.println("invalid size");
            break;
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int size;
        double balance = 100;
        String answer;
        String answer2;
        int price;
        int earnings;
        while(x == 1) {
            System.out.println("do you want to build a new pyramid?");
            answer = input.nextLine();
            if(answer.equals("y")) {
                System.out.println("insert the size of your new pyramid");
                size = input.nextInt();
                price = size * 20;
                System.out.println("this pyramid costs: " + price + "$");
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                price = size * 20;
                balance = balance - price;
                System.out.println("you have bought a pyramid of size: " + size + ". Your new balance is: " + balance + "$");
                Main obj = new Main(size);
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                earnings = size * 10;
                balance = earnings + balance;
                System.out.println("you have earned: " + earnings + "$" + "from rent");
                System.out.println("you now have a balance of: " + balance + "$");
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (answer.equals("n")) {
                earnings = 0;
                System.out.println("nothing was done this turn");
                System.out.println("you have earned: " + earnings + "$");
                System.out.println("you now have a balance of: " + balance + "$");
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                    System.out.println("nothing was done this turn");
                    try {
                        TimeUnit.SECONDS.sleep(4);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }
    }
}