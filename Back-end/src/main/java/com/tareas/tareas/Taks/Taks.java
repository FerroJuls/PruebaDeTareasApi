package com.tareas.tareas.Taks;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Taks {

    //programar una tarea que se ejecute cada 10 segundo
    //milisegundos
    //1 segundo en milisegundos 1000
    // @Scheduled(fixedRate = 10000) 
    // public void sendNotification10Second() {
    //     SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
    //     long miliseconds = System.currentTimeMillis();
    //     java.sql.Date date = new Date(miliseconds);
    //     String dateFormateada = formato.format(date);
    //     System.out.println("Tarea de 10 segundos tiempo: " + dateFormateada);
    //     System.out.println();
    // }
    //fixedRate=al inicio y luego el tiempo destinado
    //initialDelay=tenga un tiempo espera antes de iniciar
    // @Scheduled(fixedDelay  = 60000,initialDelay = 10000) 
    // public void sendNotificationOneMinute() {
    //     SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
    //     long miliseconds = System.currentTimeMillis();
    //     java.sql.Date date = new Date(miliseconds);
    //     String dateFormateada = formato.format(date);
    //     System.out.println("Tarea de 1 minuto tiempo: " + dateFormateada);
    //     System.out.println();
    // }
    /*
     * 1 segundo=1.000
     * 1 minuto=60.000
     * 1 hora=3.600.000
     * 1 día =86,400,000
     */

     //cron
     @Scheduled(cron = "0 25 13 * * 1")
    public void sendNotificationcron() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        long miliseconds = System.currentTimeMillis();
        java.sql.Date date = new Date(miliseconds);
        String dateFormateada = formato.format(date);
        System.out.println("Tarea con cron: " + dateFormateada);
        System.out.println();
    }
}
