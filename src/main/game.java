/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author YOGA SAPUTRA
 */
public class game {
    public static void player(){
    
}
      public static void main(String[] args){

        // membuat objek player
        player1 player = new player1();

        // mengisi atribut player
        player.name = "Petani Kode";
        player.speed = 78;
        player.healthPoin = 0;

        // menjalankan method
        player.run();

        if(player.isDead()){
            System.out.println("Game Over!");
        }

}
}
