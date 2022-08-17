package org.christopher.adasme.poointerfaces.imprenta.model;

public class Pagina extends Hoja{
    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
