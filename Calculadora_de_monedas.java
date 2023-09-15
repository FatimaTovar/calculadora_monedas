/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_de_monedas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Calculadora_de_monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese cantidad en pesos");
        int pesos = lectura.nextInt();
        double euro = pesos/18.21;
        double dolares = pesos/17.07;
        double yen = pesos/0.12;
        double libras = pesos/21.18;
        
        System.out.println("La cantidad ingresada en euros es: " + euro);
        System.out.println("La cantidad ingresada en dolares es: " + dolares);
        System.out.println("La cantidad ingresada en yenes es: " + yen);
        System.out.println("La cantidad ingresada en libras es: " + libras);
        lectura.close();
        
        
        
    }
    
}
