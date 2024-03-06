/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora02;

/**
 *
 * @author carlo
 */
public class Operaciones {
      //Atributos
     //Metodos
    //Metodo de suma
public int sumar(int numero1,int numero2){
  int suma=numero1+numero2;
  return suma;
}
public int restar(int numero1,int numero2){
  int resta=numero1-numero2;
  return resta;
}
public int multiplicar(int numero1,int numero2){
  int multiplicacion=numero1*numero2;
  return multiplicacion;
}
public int dividir(int numero1,int numero2){
  int division=numero1/numero2;
  return division;
}
public void mostrarResultados(int suma,int resta,int multiplicacion,int division){
    System.out.println("la suma es: "+suma);
    System.out.println("la resta es: "+resta);
    System.out.println("la multiplicacion es: "+multiplicacion);
    System.out.println("la division es: "+division);
    }

}
