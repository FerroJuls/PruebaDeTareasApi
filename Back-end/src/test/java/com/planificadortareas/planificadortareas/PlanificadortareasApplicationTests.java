package com.planificadortareas.planificadortareas;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.planificadortareas.planificadortareas.Models.usuario;
import com.planificadortareas.planificadortareas.Service.usuarioService;

@SpringBootTest
class PlanificadortareasApplicationTests {

	@Autowired
	private usuarioService data;


	@Test
	void contextLoads() {
	}

	//comprobar que se registre correctamente
	@Test
	void testRegistroCorrecto(){
		usuario usuario=new usuario();
		usuario.setTd("CC");
		usuario.setDocumento("1022215451");
		usuario.setNombre("Julian Fierro");
		usuario.setCorreo("dc8987835@gmail.com");
		usuario.setContrasena("ysgdhaj3");
		usuario.setNacimiento(new Date(2005, 8, 20));
		usuario.setActualizacion(new Date(2024,3,10));
		usuario.setIniciosesion(new Date(2024,3,10));
		usuario.setEstado("Activo");

		
		var ID = data.save(usuario);
		assertNotNull(ID);

	}
	//comprobar que se registre correctamente
	@Test
	void testFiltro1(){
		// usuario usuario=new usuario();
		// usuario.setTd("CC");
		// usuario.setDocumento("1022215451");
		// usuario.setNombre("Julian Fierro");
		// usuario.setCorreo("dc8987835@gmail.com");
		// usuario.setContrasena("ysgdhaj3");
		// usuario.setNacimiento(new Date(2005, 8, 20));
		// usuario.setActualizacion(new Date(2024,3,10));
		// usuario.setIniciosesion(new Date(2024,3,10));
		// usuario.setEstado("Activo");

		
		// data.save(usuario);

		var test=data.filtroUsuario("carlos");
		// assertEquals(test.size(), 1);
		assertNotEquals(test.size(), 0);

	}


}
