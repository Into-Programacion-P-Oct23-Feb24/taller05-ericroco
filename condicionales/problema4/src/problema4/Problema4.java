/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author StarMedia
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int dias;
        double precio;
        double subtotal;
        double descuento = 0;
        double total_pagar;

        System.out.println("Ingrese el numero de dias que va a hospedarse");
        dias = entrada.nextInt();
        System.out.println("Ingrese el precio por dias de su habitacion");
        precio = entrada.nextDouble();
        subtotal = (dias * precio);

        if (dias > 15) {
            descuento = subtotal * 0.20;
        } else {
            if (dias > 10 && dias <= 15) {
                descuento = subtotal * 0.15;
            } else {
                if (dias > 5 && dias <= 10) {
                    descuento = subtotal * 0.10;
                }
            }
        }
        total_pagar = (subtotal - descuento);
        System.out.printf("------FACTURA------\nSubtotal: %.2f\nDescuento: %.2f\nTotal: %.2f"
        , subtotal, descuento, total_pagar);
    }
}
