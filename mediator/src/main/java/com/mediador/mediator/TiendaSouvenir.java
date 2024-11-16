package com.mediador.mediator;

public class TiendaSouvenir {
    private Mediator mediator;
    private String nombre;

    public TiendaSouvenir(Mediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public void reportepromociones(String promociones) {
        mediator.notificacionModulo("tiendasouvenir ("+nombre+")", promociones);
    }
}
