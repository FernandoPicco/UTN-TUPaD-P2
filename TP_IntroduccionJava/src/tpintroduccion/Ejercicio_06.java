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
public class Ejercicio_06 {
    public static void main(String[]args){
        // Enunciado: Manejar conversiones de tipo y división en Java.
        //a. Crea una clase llamada Ejercicio_06.
        //b. Escribe un programa que divida dos números enteros ingresados por el usuario.
        //c. Modifica el código para usar double en lugar de int y compara los resultados.
        
        Scanner input = new Scanner(System.in);        
        int n1, n2, divisionEnt;
        double divisionMod;
        
        System.out.print("Ingrese un número entero: ");
        n1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese otro: ");
        n2 = Integer.parseInt(input.nextLine());
        
        divisionEnt = n1 / n2;
        divisionMod = (double) n1 / n2;
        
        System.out.println("El resultado de la división  entera es: " + divisionEnt);
        System.out.println("El resultado de la división con double es: " + divisionMod);
        
        
        
        
    }
    
}
