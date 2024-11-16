package com.mediador.mediator;

import java.util.ArrayList;
import java.util.List;

public class ParkMediador implements Mediator{
    private List<String> notificaciones = new ArrayList<>();

    @Override
    public void notificacionModulo(String module, String message){
        String notificacion = module + ":" + message;
        notificaciones.add(notificacion);
        System.out.println(notificacion);
    }

    public List<String> getNotificaciones(){
        return notificaciones;
    }
}
