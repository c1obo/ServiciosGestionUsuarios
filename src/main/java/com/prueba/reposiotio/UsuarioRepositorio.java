package com.prueba.reposiotio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.models.Usuario;


 
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
 
}