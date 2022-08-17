package org.christopher.adasme.poointerfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }
    public Curriculum addExperiencia(String exp){
        experiencias.add(exp);
        return this;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "persona='" + persona + '\'' +
                ", carrera='" + carrera + '\'' +
                ", experiencias=" + experiencias +
                ", contenido='" + contenido + '\'' +
                '}';
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre:");
        sb.append(this.persona).append("\n")
        .append("Resumen:").append("\n")
        .append(this.carrera).append("\n")
        .append("Experiencias: \n");
        for(String exp: this.experiencias){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
