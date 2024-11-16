package com.mediador.mediator;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/apk")
public class ParkController {
    private ParkMediador Mediador;
    private Atracion atracion;
    private Restaurante restaurante;
    private TiendaSouvenir tiendaSouvenir;
    private Espectaculo espectaculo;
    private NotificacionesSystema notificacionesSystema;

    public ParkController() {
        this.Mediador = new ParkMediador();
        this.atracion = new Atracion(Mediador,"ruleta rusa",98,true);
        this.restaurante = new Restaurante(Mediador,"delisa",15);
        this.tiendaSouvenir = new TiendaSouvenir(Mediador,"fiesta feliz");
        this.espectaculo = new Espectaculo(Mediador,"los inigualables","d14");
        this.notificacionesSystema = new NotificacionesSystema(Mediador);
    }

    @GetMapping("/status/atracion")
    public String getatracionestatus() {
        atracion.reportestatus("operacional");
        return "reporte de la atracion";
    }

    @GetMapping("/status/restaurante")
    public String getrestaurantestatus() {
        restaurante.informedisponibilidad("mesas disponibles");
        return "reporte del restaurante";
    }

    @GetMapping("/promociones/tiendasouvenir")
    public String gettiendasouvenirstatus() {
        tiendaSouvenir.reportepromociones("compra uno lleva el otro gratis");
        return "reporte del tiendasouvenir";
    }

    @GetMapping("/status/espectaculo")
    public String getespectaculostatus() {
        espectaculo.reporespetaculo("proximo espectaculo a las 3pm");
        return "reporte del espectaculo";
    }


    @GetMapping("/notificacion")
    public List<String> getNotificaciones() {
        return Mediador.getNotificaciones();
    }

    @PostMapping("/notificar")
    public String enviarNotificacion(@RequestParam String message) {
        notificacionesSystema.enviarnotificacion(message);
        return "notificacion enviada" + message;
    }


}
