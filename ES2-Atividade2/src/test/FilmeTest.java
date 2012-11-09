package test;

import model.Filme;

import org.junit.Test;

import dao.FilmeDao;

public class FilmeTest {

	@Test
	public void testFilmeDaoInsert() {
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.conectar();
		
		Filme u = new Filme(1, "teste", "teste", "teste", "teste", "teste",
				"teste", "teste", "teste");
		u.addListaElenco("teste2"); 

		filmeDao.insert(u);
		filmeDao.desconectar();
		System.out.println("Filme cadastrado com Sucesso!");
	}

}
