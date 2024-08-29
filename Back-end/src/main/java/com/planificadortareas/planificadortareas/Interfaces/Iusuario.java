package com.planificadortareas.planificadortareas.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.planificadortareas.planificadortareas.Models.usuario;

@Repository
public interface Iusuario extends CrudRepository<usuario, String> {

    @Query ("SELECT u FROM usuario u WHERE u.nombre LIKE %?1% OR u.correo LIKE %?1% OR u.documento LIKE %?1% OR u.estado LIKE %?1%")
    List<usuario> filtroUsuario(String filtro);

    @Query ("SELECT u FROM usuario u WHERE DATEDIFF( u.nacimiento, NOW())>=18 AND td = 'TI'")
    List<usuario> cambiarTipoDocumento();

    @Query("SELECT u FROM usuario u WHERE  DATEDIFF(NOW(), u.actualizacion) >= 90")
    List<usuario> actualizarContraseña(String actualizarContraseña);

    @Query("SELECT u FROM usuario u WHERE  DATEDIFF(NOW(), u.iniciosesion) >= 30")
    List<usuario> iniciosesionNotificar(String iniciosesionNotificar);

}
