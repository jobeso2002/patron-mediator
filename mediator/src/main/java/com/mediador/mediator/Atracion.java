package com.mediador.mediator;

public class Atracion {
    private Mediator mediator;
    private String nombre;
    private int capacidad;
    private boolean estado;

    public Atracion(Mediator mediator, String nombre, int capacidad, boolean estado) {
        this.mediator = mediator;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public void reportestatus(String estatus){
        mediator.notificacionModulo("atracion (" + nombre+ capacidad + estado +
                ")", estatus);
    }
}
