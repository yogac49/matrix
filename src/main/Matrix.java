package main;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
       int matriks1[][] = new int[10][10];  //variabel array dengan panjang data 10 
       int matriks2[][] = new int[10][10];
        int hasil[][] = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan Pilihan :\n"
                +"1.Penjumlahan\n"+
                 "2.pengurangan\n"); 
            int pilihan=input.nextInt();
            
            //input jumlah baris dan kolom   
        System.out.println("masukkan jumlah baris");
        Scanner jmlhbaris = new Scanner(System.in);
        int p = jmlhbaris.nextInt();//variabel untuk jumlah baris 
        System.out.println("m1asukkan jumlah kolom");
        Scanner jmlkolm = new Scanner(System.in);
        int q = jmlkolm.nextInt();//variabel untuk jumlah baris
        
        //input jumlah elemen 1&2
        System.out.println("masukkan elmen 1");
        for (int k = 0; k < p; k++) {
            for (int l = 0; l < q; l++) {             
                matriks1[k][l]=input.nextInt();//variabel matrix 1 untuk elemen 1
            }   
        }
        System.out.println("masukkan elemen 2");
           for (int k = 0; k < p; k++) {
               for (int l = 0; l < q; l++) {                  
                   matriks2[k][l]=input.nextInt();//variabel matrix 2 untuk elemen 2
               }
           }
           switch(pilihan){//percabangan switch case 
               case '1':{
        System.out.println("hasil pemjumlahan matrix");
        for (int k = 0; k < p; k++) {
            for (int l = 0; l < q; l++) {
                hasil[k][l] =   matriks1[k][l] + matriks2[k][l];
                System.out.println(hasil[k][l]+"\t");
            }
        }
               }
        break;
               case '2':{
                    System.out.println("hasil pengurangan matrix");
        for (int k = 0; k < p; k++) {
            for (int l = 0; l < q; l++) {
                hasil[k][l] =   matriks1[k][l] - matriks2[k][l];
                System.out.println(hasil[k][l]+"\t");
            }
        }
               }
        break; 
               default:
        System.out.println("data yang anda masukkan salah");
        break;
}
    }
}

