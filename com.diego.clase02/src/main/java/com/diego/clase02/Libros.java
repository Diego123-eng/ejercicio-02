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
public class Libros {
    
   private int Id;
   private String NombreLibro;
   private int NumeroPagina;
   private String Autor;
   
   public Libros(int Id, String NombreLibro,int NumeroPagina,String Autor) {
   
   this.Id = Id; 
   this.NombreLibro = NombreLibro;
   this.NumeroPagina = NumeroPagina;
   this.Autor = Autor;
   
   
   }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPagina() {
        return NumeroPagina;
    }

    public void setNumeroPagina(int NumeroPagina) {
        this.NumeroPagina = NumeroPagina;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "Id=" + Id + ", NombreLibro=" + NombreLibro + ", NumeroPagina=" + NumeroPagina + ", Autor=" + Autor + '}';
    }
   
   
   
   
}
