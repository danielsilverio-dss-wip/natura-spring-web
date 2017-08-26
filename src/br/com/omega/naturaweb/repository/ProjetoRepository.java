package br.com.omega.naturaweb.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.omega.naturaweb.entity.Projeto;

@Repository
public interface ProjetoRepository {
	
	public void save(Projeto projeto);
	public Projeto findOne(long id);
	public List<Projeto> findAll();

}
