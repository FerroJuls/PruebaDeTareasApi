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

    @Scheduled(fixedRate = 60000)
    public void sendNotificationcron() {

        var listaUsuario=data.cambiarTipoDocumento();
        for(usuario usuario:listaUsuario){
            System.out.println("Usuario actualizar documento "+ 
            usuario.getNombre());
            email.cambiarTipoDocumento(usuario);
        }
        // SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        // long miliseconds = System.currentTimeMillis();
        // java.sql.Date date = new Date(miliseconds);
        // String dateFormateada = formato.format(date);
        // System.out.println("Tarea con cron: " + dateFormateada);
        // System.out.println();
    }
}

