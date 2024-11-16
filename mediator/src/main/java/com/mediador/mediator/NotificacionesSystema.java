package com.mediador.mediator;

public class NotificacionesSystema {
    private Mediator mediator;
    public NotificacionesSystema(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enviarnotificacion(String message) {
        mediator.notificacionModulo("notificacion del sistema", message);
    }
}
