/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.sahidmunoz2026;

import ec.edu.espoch.sahidmunoz2026.libros.Categorias;
import ec.edu.espoch.sahidmunoz2026.libros.Clientes;
import ec.edu.espoch.sahidmunoz2026.libros.Libros;
import ec.edu.espoch.sahidmunoz2026.libros.Pedidos;

/**
 *
 * @author USUARIO
 */
public class SahidMunoz2026 {

    public static void main(String[] args) {

        Clientes cliente = new Clientes("001", "Sahid Dilan");

        Libros libro1 = new Libros("Asi habló Zaratusta", "Friedrich Nietzsche", 50.00, Categorias.EDUCATIVO);
        Libros libro2 = new Libros("Crimen y castigo", "Fiódor Dostoyevski", 20.00, Categorias.EDUCATIVO);

        Pedidos pedido = new Pedidos();

        System.out.println("Detalles de los libros:");
        pedido.mostrarDetalleProducto(libro1);
        pedido.mostrarDetalleProducto(libro2);

        System.out.println("\nCompra final:");
        pedido.mostrarClienteYProducto(cliente, libro1);
        pedido.mostrarClienteYProducto(cliente, libro2);
    }

}
