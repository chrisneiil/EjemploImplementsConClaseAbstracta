package org.christopher.adasme.poointerfaces.imprenta;

import org.christopher.adasme.poointerfaces.imprenta.enums.Genero;
import org.christopher.adasme.poointerfaces.imprenta.model.*;

public class ejemploImprenta {
     public static void main(String[] args) {

         Curriculum cv = new Curriculum ("Resumen Laboral...", new Persona("Juanito", "Perez"), "Fisica" );
         cv.addExperiencia("Profesor primaria");
         cv.addExperiencia("Profesor enseñansa media");
         cv.addExperiencia("Profesor particular");

         Informe informe = new Informe("Estudios de auto servicio", new Persona("Joaquin", "Oses"),new Persona("Michael","Rojas"));
         Libro libro = new Libro("Love Craft","Shub niggurath", Genero.TERROR);
         libro.addPagina(new Pagina("Pag 1: index"));
         libro.addPagina(new Pagina("Pag 2: inicio"));
         libro.addPagina(new Pagina("Pag 2: personajes"));
         System.out.println("Libro: \n");
         imprimir(libro);
         System.out.println("Cv: \n");
         imprimir(cv);
         System.out.println("Informe: \n");
         imprimir(informe);
    }
    public static void imprimir (Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
