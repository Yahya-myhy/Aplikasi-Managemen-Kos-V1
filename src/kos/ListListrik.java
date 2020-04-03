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
public class ListListrik {
    Scanner scan = new Scanner(System.in);
     double listrik;
     public void listrik(){
         System.out.println("List Tarif listrik : ");
         System.out.println("- 1800VA-2200VA = Rp.80.000 ");
         System.out.println("- 1500VA-1800VA = Rp.60.000 ");
         System.out.println("- 1100VA-1500VA = Rp.30.000 ");
         System.out.println("Masukkan penggunaan Listrik Rp. ");
         listrik =scan.nextDouble();
      }
}
