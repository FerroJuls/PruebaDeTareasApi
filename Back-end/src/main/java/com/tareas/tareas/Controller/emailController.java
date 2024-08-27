// package com.tareas.tareas.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.mail.javamail.JavaMailSender;
// import org.springframework.mail.javamail.MimeMessageHelper;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.tareas.tareas.InterfacesService.IusuarioService;
// import com.tareas.tareas.models.usuario;

// import jakarta.mail.MessagingException;
// import jakarta.mail.internet.MimeMessage;

// @RestController
// public class emailController {

//     @Autowired
//     private JavaMailSender javaMailSender;

//     @Autowired
//     private IusuarioService usuarioService;

//     @GetMapping("/enviar-correo-registro")
//     public String enviarCorreoRegistro(usuario usuario) {
//         try {
//             String destinatario = usuario.getCorreo();
//             String asunto = "Registro en la Plataforma";
//             String cuerpo = "<p>Estimado " + usuario.getNombre() + ",</p>"
//                     + "<p>Bienvenido a nuestra plataforma. Nos complace informarle que ha sido registrado con éxito en nuestro sistema. ¡Esperamos que disfrute de nuestra aplicación!</p>"
//                     + "<p>Sus credenciales de inicio de sesión son las siguientes:</p>"
//                     + "<ul><li><strong>Nombre de Usuario:</strong> " + usuario.getCorreo() + "</li></ul>"
//                     + "<p>Por favor, inicie sesión en nuestro portal utilizando esta información. Le recomendamos cambiar su contraseña después del primer inicio de sesión por motivos de seguridad.</p>"
//                     + "<p>Si tiene alguna pregunta o necesita asistencia, no dude en ponerse en contacto con nuestro equipo de soporte.</p>"
//                     + "<p>Gracias por unirse a nosotros.</p>"
//                     + "<p>Atentamente,<br>Genius Inventory Company<br>invgenius2024@gmail.com</p>";

//             boolean retorno = enviarCorreo(destinatario, asunto, cuerpo);
//             return retorno ? "Correo enviado correctamente" : "No se pudo enviar el correo";
//         } catch (Exception e) {
//             return "Error al enviar el correo: " + e.getMessage();
//         }
//     }

//     public boolean enviarCorreo(String destinatario, String asunto, String cuerpo) throws MessagingException {
//         try {
//             MimeMessage message = javaMailSender.createMimeMessage();
//             MimeMessageHelper helper = new MimeMessageHelper(message, true);

//             helper.setTo(destinatario);
//             helper.setSubject(asunto);
//             helper.setText(cuerpo, true);

//             javaMailSender.send(message);
//             return true;
//         } catch (Exception e) {
//             System.out.println("Error al enviar correo: " + e.getMessage());
//             return false;
//         }
//     }
// }
