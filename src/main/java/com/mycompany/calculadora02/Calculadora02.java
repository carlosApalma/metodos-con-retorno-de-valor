/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora02;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Calculadora02 {

    public static void main(String[] args) {
   
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita un num 1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita un num 2: "));
        
        Operaciones op=new Operaciones();
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1,n2);
        op.dividir(n1, n2);
        op.mostrarResultados();
        }
}
    

