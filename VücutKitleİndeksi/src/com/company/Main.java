package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,index;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=input.nextDouble();
        index=kilo/(boy*boy);
        System.out.println("Vücut kite indeksiniz: "+index);

    }
}
