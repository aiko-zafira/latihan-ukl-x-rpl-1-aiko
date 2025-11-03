package com.ukl;

import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        double berat, jarak;
        double panjang, lebar, tinggi;
        double biaya;

        System.out.print("Masukkan berat paket (kg): ");
        berat = sc.nextDouble();

        System.out.print("Masukkan jarak (km): ");
        jarak = sc.nextDouble();

        System.out.print("Masukkan panjang (cm): ");
        panjang = sc.nextDouble();

        System.out.print("Masukkan lebar (cm): ");
        lebar = sc.nextDouble();

        System.out.print("Masukkan tinggi (cm): ");
        tinggi = sc.nextDouble();

        double volume = panjang * lebar * tinggi;

        if(jarak <= 10){
            biaya = berat * 4250;
        }else{
            biaya = berat * 6000;
        }

        if(volume > 100){
            biaya += 50000;
        }

        System.out.println("Total biaya pengiriman: Rp " + biaya);
    }
}