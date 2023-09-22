package com.edhm.Usuarios.service;

import com.edhm.Usuarios.entity.Usuario;

public interface AuthenticationService {
	Usuario findByUsernameAndPassword(String username, String password);
	Usuario findByUsername(String username);

}
