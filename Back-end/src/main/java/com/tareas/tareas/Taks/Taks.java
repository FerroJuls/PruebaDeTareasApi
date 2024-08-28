package com.tareas.tareas.Taks;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Taks {
     @Scheduled(cron = "0  13 * * *")
    public void sendNotificationcron() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        long miliseconds = System.currentTimeMillis();
        java.sql.Date date = new Date(miliseconds);
        String dateFormateada = formato.format(date);
        System.out.println("Tarea con cron: " + dateFormateada);
        System.out.println();
    }
}

