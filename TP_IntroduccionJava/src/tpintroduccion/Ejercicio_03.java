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
public class Ejercicio_03 {
    public static void main(String[]args){
        
        //Enunciado: Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
            //los muestre en pantalla. Usa Scanner para capturar los datos.
                // a. Crea una clase llamada Ejercicio_03.
                // b. Usa la clase Scanner para capturar los datos ingresados por el usuario.
        
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Edad: " + edad + " años.");
        
        
    }
    
}
