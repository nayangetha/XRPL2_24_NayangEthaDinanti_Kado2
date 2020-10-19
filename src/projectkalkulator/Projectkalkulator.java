/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkalkulator;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Projectkalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Kalkullator");
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Pilihan Operator:\n 1. Penjumlahan (+)\n "
                + "2. Pengurangan(-)\n 3. Perkalian (*)\n 4. Pembagian (/)\n 5. Modulus (%)\n");
        System.out.println("-------------------------------------------------------------------");
        
        Scanner inputUser;
        float a,b,hasil;
        String operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Masukkan Nilai b = ");
        b = inputUser.nextFloat();
        System.out.print("Masukkan Operator = ");
        operator = inputUser.next();
        
        System.out.println("-------------------------------------------------------------------");
        
        switch (operator){
            case "1":
                //Operator Penjumlahan
                hasil = a + b;
                System.out.println(a+" + "+b+" = "+hasil);
                break;
            case "2":
                //Operator Pengurangan
                hasil = a - b;
                System.out.println(a+" - "+b+" = "+hasil);
                break;
            case "3":
                //Operator Perkalian
                hasil = a * b;
                System.out.println(a+" * "+b+" = "+hasil);
                break;
            case "4":
                //Operator Pembagian
                hasil = a / b;
                System.out.println(a+" / "+b+" = "+hasil);
                break;    
            case "5":
                //Operator Modulus
                hasil = a % b;
                System.out.println(a+" % "+b+" = "+hasil);
                break;   
            default:
                System.out.println("Operator '"+operator+"' Tidak Ditemukan");
            
                
        }
    }
    
}
