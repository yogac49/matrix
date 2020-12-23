/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author YOGA SAPUTRA
 */
public class kalkulator {
    public static void main(String[] args) {
        double hasil=0;
        System.out.println("masukkan Pilihan :\n"+"1.Penjumlahan\n"
                +"2.Pengurangan\n"
                +"3.Perkalian\n"
                +"4.Pembagian\n");
        Scanner input= new Scanner(System.in);
            int pilihan = input.nextInt();
            
            Scanner inp = new Scanner(System.in);
            System.out.println("masukkan bilangan 1");
            double bil1 =inp.nextInt();
            System.out.println("masukkan bilangan 2");
            double bil2 =inp.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("hasil dari penjumlahan");
                    hasil = bil1 + bil2;
                    System.out.println(bil1+" + "+bil2+"="+hasil);
                    break;
                case 2:
                    System.out.println("hasil dari pengurangan");
                    hasil = bil1 - bil2;
                    System.out.println(bil1+" - "+bil2+"="+hasil);
                    break;
                case 3:
                    System.out.println("hasil dari perkalian");
                    hasil = bil1 * bil2;
                    System.out.println(bil1+" x "+bil2+"="+hasil);
                    break;
                case 4:
                    System.out.println("hasil dari pembagian");
                    hasil = bil1 / bil2;
                    System.out.println(bil1+" : "+bil2+"="+hasil);
                    break;
                default:
                    System.out.println("data yang anda masukkan salah");
                    break;
            }
    }
    
}
