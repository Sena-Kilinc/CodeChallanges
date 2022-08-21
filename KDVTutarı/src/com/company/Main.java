package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double tutar,kdvOran,kdvTutar,kdvliTutar;
        System.out.println("Ücret tutarını giriniz: ");
        tutar= inp.nextDouble();

        kdvOran= tutar>0 && tutar<1000? 0.18:0.08;

        kdvTutar= tutar*kdvOran;
        kdvliTutar= tutar+kdvTutar;

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV Oranı: "+kdvOran);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.println("KDV'li Tutarı: "+kdvliTutar);



    }
}
