/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apellido_nombre_nombreejercicio;
import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Apellido_Nombre_NombreEjercicio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        sc.useDelimiter("\n");
        String  Nombre=" ";
        int Horasmensuales; 
        double Tarifaporhora;
         
           
         System.out.print("Favor ingresar Nombre: ");
         Nombre = sc.next(); 
         
         System.out.print("Favor ingresar horas de trabajo mensual: ");
         Horasmensuales = sc.nextInt();
         
         System.out.print("Favor ingresar Tarifa por hora: ");
         Tarifaporhora = sc.nextDouble();
         
         double salariosemanal = (Horasmensuales * Tarifaporhora);
         System.out.print("Su salario semanal es: "+ salariosemanal);
         
         
         
    }
}
