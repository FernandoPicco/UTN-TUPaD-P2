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
public class Ejercicio_07 {
    public static void main(String[]args){
        
        //Enunciado: Corrige y analiza un código con errores.
        //a. Crea una clase llamada Ejercicio_07.
        //b. Corrige el siguiente código para que funcione correctamente.
        //c. Explica (puedes hacerlo mediante comentarios en el mismo código) qué
        //error tenía la lectura de datos y cómo lo solucionaste.
        
        Scanner input = new Scanner(System.in);
        
        String nombre; //Error (Faltó declarar la variable)
        System.out.print("Ingresa tu nombre: ");
        //String nombre = scanner.nextInt(); // ERROR: se intenta leer un String
        // usando nextInt() ==> Incorrecto. Solo lee nros. enteros.
        
        nombre = input.nextLine(); // Solución: reemplacé nextInt(), por nextLine()
        // permite leer texto completo.
        
        System.out.println("Hola, " + nombre);
    }
    
}
