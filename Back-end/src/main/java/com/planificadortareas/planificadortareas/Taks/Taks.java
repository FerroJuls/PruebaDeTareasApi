package com.planificadortareas.planificadortareas.Taks;

// import java.sql.Date;
// import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.planificadortareas.planificadortareas.Models.usuario;
import com.planificadortareas.planificadortareas.Service.emailService;
import com.planificadortareas.planificadortareas.Service.usuarioService;

@Component
public class Taks {

    @Autowired
    private usuarioService data;

    @Autowired
    private emailService email;

    @Scheduled(cron = "0 35 8 * * *")
    public void sendNotificationcron() {

        var listaUsuario=data.cambiarTipoDocumento();
        for(usuario usuario:listaUsuario){
            System.out.println("Usuario actualizar documento "+ 
            usuario.getNombre());
            email.cambiarTipoDocumento(usuario);
        }
    }

    @Scheduled(cron= "0 35 8 * * *" )
    public void sendNotificationcronactualizarcontrasena(){

        var listaUsuario=data.actualizarContrasena();
        for(usuario usuario:listaUsuario){
            System.out.println("Usuario cambiar contraseña"+
            usuario.getNombre());
            email.actualizarContraseña(usuario);
        }

    }

    @Scheduled(cron= "0 35 8 * * 0" )
    public void sendNotificationcroniniciosesionNotificar(){

        var listaUsuario=data.iniciosesionNotificar();
        for(usuario usuario:listaUsuario){
            System.out.println("Usuario inicia sesion pronto en la Mafia"+
            usuario.getNombre());
            email.iniciosesionNotificar(usuario);
        }

    }


}

