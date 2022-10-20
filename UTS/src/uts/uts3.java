/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import javax.swing.JOptionPane;

/**
 *
 * @author Fachri
 */
public class uts3 {
    public static void main(String[]args){
        String angka ="";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int a = Integer.valueOf(angka).intValue();
   
        String hasil ="";
        if (a >= 0 ){
            hasil += "Bilangan Positif";
        }
        else{
            hasil += "Bilangan Negatif";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
  

