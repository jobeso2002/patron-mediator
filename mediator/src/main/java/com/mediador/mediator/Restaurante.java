package com.mediador.mediator;

public class Restaurante {
    private Mediator mediator;
    private String nombre;
    private int totaldemesa;

    public Restaurante(Mediator mediator, String nombre, int totaldemesa) {
        this.mediator = mediator;
        this.nombre = nombre;
        this.totaldemesa = totaldemesa;
    }

    public void informedisponibilidad(String disponibilidad) {
        mediator.notificacionModulo("Restaurante ("+ nombre + totaldemesa+
                ")", disponibilidad);

    }
}
