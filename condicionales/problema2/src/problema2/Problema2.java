/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author StarMedia
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String descripcion = "Este producto es una pieza avanzada de tecnologia";
        int cantidad = 45;
        double precio_unitario = 12.5;
        double costo_pedido = (cantidad * precio_unitario);
        if (cantidad > 50) {
            costo_pedido = (costo_pedido - (costo_pedido * 0.15));

        }
        System.out.printf("------Pedido------\nDescripción: %s\nCantidad: %d\n"
        + "Precio Unitario: %.2f\nCosto: %.2f", descripcion, cantidad, precio_unitario, costo_pedido);
    }
}
