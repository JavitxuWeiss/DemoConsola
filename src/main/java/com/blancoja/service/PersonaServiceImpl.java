package com.blancoja.service;

import com.blancoja.repository.IPersonaRepo;
import com.blancoja.repository.PersonaRepoImpl;

public class PersonaServiceImpl implements IPersonaService{

	IPersonaRepo repo;
	
	
	@Override
	public void registrar(String nombre) {
		repo= new PersonaRepoImpl();
		repo.registrar(nombre);
		
	}

}
