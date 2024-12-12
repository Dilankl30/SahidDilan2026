/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sahidmunoz2026.libros;

/**
 *
 * @author USUARIO
 */
public class Pedidos {

    public void mostrarDetalleProducto(Libros producto) {
        double precioConIva = producto.getPrecio() + (producto.getPrecio() * 0.12);
        System.out.println("Título: " + producto.getTitulo());
        System.out.println("Autor: " + producto.getAutor());
        System.out.println("Género: " + producto.getCategoria());
        System.out.println("Precio (sin IVA): $" + producto.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);
    }

    public void mostrarClienteYProducto(Clientes cliente, Libros producto) {
        double precioConIva = producto.getPrecio() + (producto.getPrecio() * 0.12);
        System.out.println("\nCliente: " + cliente.getNombre() + " (ID: " + cliente.getId() + ")");
        System.out.println("Libro adquirido: " + producto.getTitulo());
        System.out.println("Autor: " + producto.getAutor());
        System.out.println("Género: " + producto.getCategoria());
        System.out.println("Precio (sin IVA): $" + producto.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);
    }
}
