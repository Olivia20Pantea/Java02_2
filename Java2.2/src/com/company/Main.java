package com.company;

import java.util.Scanner;

public class Main {
    private static int val_hour=40;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours=0,pay=0,calculate=0;
        System.out.println("Type the number of minutes: ");
        int nrMinutes=scanner.nextInt();
        if(nrMinutes<=60){
            pay=val_hour;
            hours=1;}
        else if(nrMinutes>60){
            hours=nrMinutes/60;
            calculate=hours*60;
            pay=val_hour*hours+(nrMinutes-calculate);}
        System.out.println("hours = " + hours);
        System.out.println("Number of minutes = " + nrMinutes);
        System.out.println("pay = " + pay);
    }
}
