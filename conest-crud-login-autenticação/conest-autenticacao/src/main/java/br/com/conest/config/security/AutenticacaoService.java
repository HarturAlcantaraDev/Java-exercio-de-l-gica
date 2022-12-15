package br.com.conest.config.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.conest.model.UsuarioModel;
import br.com.conest.repository.UsuarioRepository;

public class AutenticacaoService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		Optional <UsuarioModel> usuario = repository.findByEmail(username);
		if(usuario.isPresent()) {
			return (UserDetails) usuario.get();
		}
		throw new UsernameNotFoundException("Dados invalidos");
	}

}
