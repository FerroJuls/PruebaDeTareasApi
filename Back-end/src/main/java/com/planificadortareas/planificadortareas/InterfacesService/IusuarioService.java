package com.planificadortareas.planificadortareas.InterfacesService;

import java.util.List;
import java.util.Optional;

import com.planificadortareas.planificadortareas.Models.usuario;


public interface IusuarioService {

    public String save(usuario usuario);

    public List<usuario> findAll();

    public Optional<usuario> findOne(String id);

    public int deleteForever(String id);

    // Filtro
    public List<usuario> filtroUsuario(String filtro);
    public List<usuario> cambiarTipoDocumento();
    public List<usuario> actualizarContrasena();
    public List<usuario> iniciosesionNotificar();
    
}