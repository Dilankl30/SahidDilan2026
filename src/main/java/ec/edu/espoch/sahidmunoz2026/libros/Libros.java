/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sahidmunoz2026.libros;

/**
 *
 * @author USUARIO
 */
public class Libros {

    private String titulo;
    private String autor;
    private double precio;
    private Categorias categoria;

    public Libros(String titulo, String autor, double precio, Categorias categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public Categorias getCategoria() {
        return categoria;
    }
}
