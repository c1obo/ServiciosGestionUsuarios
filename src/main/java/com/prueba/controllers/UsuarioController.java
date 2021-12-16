package com.prueba.controllers;

import java.util.List;
import java.util.Optional;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.models.Usuario;
import com.prueba.reposiotio.UsuarioRepositorio;
 

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioRepositorio userRepository;

	@GetMapping("/users")
	public List<Usuario> getAllUsers() {
        return userRepository.findAll();
    }
	
	@PostMapping("/createUser")
    public Usuario createUser(@Valid @RequestBody Usuario user) {
        return userRepository.save(user);
    }
	
	@GetMapping("/users/{id}")
    public Usuario getNoteById(@PathVariable(value = "id") Long id) {
        return userRepository.findOne(id);
    }
	
	@PutMapping("/updateUser/{id}")
    public Usuario updateUser(@PathVariable(value = "id") Long id, @Valid @RequestBody Usuario userDetails) {
 
        Usuario user = userRepository.findOne(id);
 
        
 
        Usuario updatedNote = userRepository.save(user);
        return updatedNote;
    }
	
	@DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long id) {
         
        Usuario  note = userRepository.findOne(id);
 
        userRepository.delete(note);
 
        return ResponseEntity.ok().build();
    }
}
