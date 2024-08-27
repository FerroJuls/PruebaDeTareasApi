// package com.tareas.tareas.Taks;

// import com.tareas.tareas.InterfacesService.IusuarioService;
// import com.tareas.tareas.models.usuario;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.mail.javamail.JavaMailSender;
// import org.springframework.mail.javamail.MimeMessageHelper;
// import org.springframework.scheduling.annotation.Scheduled;
// import org.springframework.stereotype.Component;

// import jakarta.mail.MessagingException;
// import jakarta.mail.internet.MimeMessage;

// import java.time.LocalDate;
// import java.util.List;

// @Component
// public class Taks {

//     @Autowired
//     private IusuarioService usuarioService;

//     @Autowired
//     private JavaMailSender javaMailSender;

//     @Scheduled(cron = "0 0 0 * * *") // Ejecutar todos los días a medianoche
//     public void revisarUsuariosCumplen18() {
//         List<usuario> usuarios = usuarioService.findAll();
//         LocalDate today = LocalDate.now();

//         for (usuario u : usuarios) {
//             LocalDate birthDate = u.getNacimiento();
//             LocalDate dayBefore18 = birthDate.plusYears(18).minusDays(1);

//             if (today.equals(dayBefore18)) {
//                 enviarCorreoCambioTipoDocumento(u);
//             }
//         }
//     }

//     private void enviarCorreoCambioTipoDocumento(usuario usuario) {
//         String destinatario = usuario.getCorreo();
//         String asunto = "Cambio de Tipo de Documento";
//         String cuerpo = "<p>Estimado " + usuario.getNombre() + ",</p>"
//                 + "<p>Nos gustaría informarle que está a un día de cumplir 18 años. Es necesario que actualice su tipo de documento en nuestra plataforma.</p>"
//                 + "<p>Por favor, inicie sesión y realice la actualización lo antes posible.</p>"
//                 + "<p>Gracias por su atención.</p>"
//                 + "<p>Atentamente,<br>Genius Inventory Company<br>invgenius2024@gmail.com</p>";

//         try {
//             MimeMessage message = javaMailSender.createMimeMessage();
//             MimeMessageHelper helper = new MimeMessageHelper(message, true);

//             helper.setTo(destinatario);
//             helper.setSubject(asunto);
//             helper.setText(cuerpo, true);

//             javaMailSender.send(message);
//             System.out.println("Correo enviado a: " + destinatario);
//         } catch (MessagingException e) {
//             System.out.println("Error al enviar correo a " + usuario.getCorreo() + ": " + e.getMessage());
//         }
//     }
// }
