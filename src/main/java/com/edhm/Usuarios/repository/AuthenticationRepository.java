package com.edhm.Usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.edhm.Usuarios.entity.Usuario;

public interface AuthenticationRepository extends CrudRepository<Usuario, Long> {
	@Query("SELECT u FROM Usuario u WHERE u.username=:username AND u.password=:password")
	Usuario findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	@Query("SELECT u FROM Usuario u WHERE u.username=:username")
	Usuario findByUsername(@Param("username") String username);
}
