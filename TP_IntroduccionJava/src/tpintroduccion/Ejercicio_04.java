/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpintroduccion;

import java.util.Scanner;

/**
 *
 * @author 111
 */
public class Ejercicio_04 {
    public static void main(String[]args){
        
        // Enunciado: Escribe un programa que solicite dos números enteros y realice las siguientes
        //operaciones:
            //a. Crea una clase llamada Ejercicio_04.
            // b. Suma
            // c. Resta
            // d. Multiplicación
            // e. División
            // f. Muestra los resultados de todas las operaciones en la consola.
        
        Scanner input = new Scanner(System.in);
        int n1, n2, suma, resta, multiplicacion;
        double division;
               
        System.out.print("Ingrese un número entero: ");
        n1 = Integer.parseInt(input.nextLine());
        
        do {
            System.out.print("Ingrese otro (distinto de cero): ");
            n2 = Integer.parseInt(input.nextLine());
            
            if (n2 == 0){
                System.out.print("No se puede dividir por cero).\n");
            }
            
        } while (n2 == 0);       
        
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = (double) n1 / n2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("multiplicación: " + multiplicacion);
        System.out.println("División: " + division);      
            
        }        
}

