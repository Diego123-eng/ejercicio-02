/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diego.clase02;

/**
 *
 * @author Usuario
 */
public class ClaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(libro.toString());
//        System.out.println(objetolibro2.getNumeroPagina());
        Libros objetolibro1 = new Libros(1, "PROGRAMACION JAVA", 100, "Deitel");
        Libros objetolibro2 = new Libros(2, "PROGRAMACION PHP", 600, "Deitel");
        
        objetolibro2.setNumeroPagina(800);
//       
        
        
        
        
//       
        if (objetolibro1.getNumeroPagina() < objetolibro2.getNumeroPagina()) {
            System.out.println("El libro 2 tiene es mayor numero de pagina que el libro 1, el libro 2 tiene un numero de paginas de" +objetolibro2.getNumeroPagina());
            System.out.println("La informacion del libro 2 es "+objetolibro2.toString());
        } else {
            System.out.println("El libro 1 tiene mayor numero de pagina que el libro 2, el libro 1 tiene un numero de paginas de" +objetolibro1.getNumeroPagina());
            System.out.println("La informacion del libro 1 es "+objetolibro1.toString());
        }

    }
