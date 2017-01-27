/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.a03.pkg2;
import java.util.Scanner;


/**
 *
 * @author Dany
 */
public class SPPRBaezMA032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     double No, NoC;
     No= pedirNo();
     NoC= calcularNoC (No);
     respuesta (NoC);
     
    }
    
    public static double pedirNo(){
        double No;
        System.out.println("Ingrese cualquier valor numérico");
        Scanner entradaNo = new Scanner (System.in);
        No = entradaNo.nextDouble();
        return No;
    }
    
    public static double calcularNoC(double No){
        double NoC, cuadrados;
        cuadrados = (Math.pow(No, 2));
        NoC= cuadrados;
        return NoC;
    }

    public static void respuesta (double NoC){
        System.out.println ("NoC=" + NoC);
    }
}
