package com.planificadortareas.planificadortareas.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planificadortareas.planificadortareas.Interfaces.Iusuario;
import com.planificadortareas.planificadortareas.InterfacesService.IusuarioService;
import com.planificadortareas.planificadortareas.Models.usuario;

@Service 
public class usuarioService implements IusuarioService {

    @Autowired
    private Iusuario data;

    @Override
    public String save(usuario usuario) {
        data.save(usuario);
        return usuario.getIdUsuario();
    }

    @Override
    public List<usuario> findAll(){
        List<usuario> listaUsuario = (List<usuario>) data.findAll();
        return listaUsuario;
    }

    @Override
    public Optional<usuario> findOne(String id){
        Optional<usuario> usuario = data.findById(id);
        return usuario;
    }

    @Override
    public int deleteForever(String id){
        data.deleteById(id);
        return 1;
    }

    // Filtro
    
    @Override
    public List<usuario> filtroUsuario(String filtro) {
        List<usuario> listaUsuario = data.filtroUsuario(filtro);
        return listaUsuario;
    }

    
    @Override
    public List<usuario> cambiarTipoDocumento() {
        List<usuario> listaUsuario = data.cambiarTipoDocumento();
        return listaUsuario;
    }

    
    @Override
    public List<usuario> actualizarContrasena() {
        List<usuario> listaUsuario = data.actualizarContrasena();
        return listaUsuario;
    }

    
    @Override
    public List<usuario> iniciosesionNotificar() {
        List<usuario> listaUsuario = data.iniciosesionNotificar();
        return listaUsuario;
    }

    
    @Override
    public List<usuario> notificacionRegistro() {
        List<usuario> listaUsuario = data.notificacionRegistro();
        return listaUsuario;
    }

    

}
