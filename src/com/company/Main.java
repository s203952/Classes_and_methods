package com.company;

import static java.lang.Math.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;



public class Main {
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
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Main obj = new Main(size);
    }
}