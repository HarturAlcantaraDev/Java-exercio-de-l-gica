package br.com.conest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.conest.model.UsuarioModel;

public interface UsuarioRepository  extends JpaRepository<UsuarioModel, Long>{
	
	Optional <UsuarioModel> findByEmail (String email);

}
