/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author StarMedia
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int edad;
        double netflix;
        double spotify;
        double youtube;
        double dropbox;
        double valor_mensual;

        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese cuanto paga por netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese cuanto paga por spotify");
        spotify = entrada.nextDouble();
        System.out.println("Ingrese cuanto paga por youtube premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese cuanto paga por dropbox");
        dropbox = entrada.nextDouble();
        valor_mensual = (netflix + spotify + youtube + dropbox);

        if (edad < 30) {
            valor_mensual = valor_mensual - (valor_mensual * 0.20);
        }
        System.out.printf("El valor a pagar mensualmente es: %.2f", valor_mensual);
    }
}
