/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kos;

import java.util.Scanner;

/**
 *
 * @author Yahya
 */
public class Transaksi {
     Scanner scan = new Scanner(System.in);
     double nominal;
     public void bayarAtas(double jumlah){
        System.out.println("Jumlah = "+jumlah); 
        System.out.print("masukkan Nominal = Rp.");
        nominal = scan.nextDouble();
        if(nominal < jumlah){
            System.out.println("Transaksi Gagal Nominal Kurang");
        }else {
            System.out.println("Pembayaran anda berhasil");
            double kembalian = nominal - jumlah;
            if(kembalian!=0){
                    System.out.println("Kembalian anda adalah Rp "+kembalian);
                    }
            else{
                System.out.println("Transaksi Berhasil");
            }
        }
    }
}
