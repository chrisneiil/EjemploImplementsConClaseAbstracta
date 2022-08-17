package org.christopher.adasme.poointerfaces.imprenta.model;

public class Informe extends Hoja implements Imprimible{
    private Persona revisor;
    private Persona autor;

    public Informe(String contenido, Persona revisor, Persona autor) {
        super(contenido);
        this.revisor = revisor;
        this.autor = autor;
    }

    public Informe(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return "informe escrito por "+ autor + " Revisado por  "+ revisor + " \n "+  contenido;
    }
}
