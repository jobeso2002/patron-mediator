package com.mediador.mediator;

public class Espectaculo {
    private Mediator mediator;
    private String nombre;
    private String sala;

    public Espectaculo(Mediator mediator, String nombre, String sala) {
        this.mediator = mediator;
        this.nombre = nombre;
        this.sala = sala;
    }

    public void reporespetaculo(String espectaculo) {
        mediator.notificacionModulo("espectaculo ("+nombre+ sala+
                ")", espectaculo);
    }
}
