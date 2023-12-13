package com.picpaysimplificado.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplificado.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
	//adicionando metodos extras
	// padrao de sintaxe do JPA (olhar na net)
	Optional<User> findUserByDocument(String document);
	
	Optional<User> findUserById(Long id);
	
}
