package test;

import model.Filme;

import org.junit.Test;

import dao.FilmeDao;

public class FilmeTest {

	/*@Test
	public void testFilmeDaoInsert() {
		FilmeDao filmeDao = new FilmeDao();
		GeneroDao generoDao = new GeneroDao();
	
		generoDao.conectar();
		filmeDao.conectar();
		
		Genero genero = new Genero(1, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false);
		
		generoDao.insert(genero);
		
		Genero g = generoDao.select(generoDao.getUltimoId());
		
		Filme u = new Filme(1, "Testando", g, "elenco", "direcao", "duracao", "classificacao", "distribuidor", "sinopse");
		
		filmeDao.insert(u);

		filmeDao.desconectar();
		generoDao.desconectar();
		System.out.println("Filme cadastrado com Sucesso!");
	}*/

	/*@Test
	public void testFilmeDaoSelect() {
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.conectar();		
		System.out.println(filmeDao.select());
		filmeDao.desconectar();		
		System.out.println("Select Filme com Sucesso!");
	}*/

	/*@Test
	public void testFilmeDaoSelect() {
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.conectar();		
		Filme f = filmeDao.select(10);		
		System.out.println(f.toString());
		filmeDao.desconectar();		
		System.out.println("SelectID Filme com Sucesso!");
	}*/
	
	/*@Test
	public void testFilmeDaoUpdate(){
		FilmeDao filmeDao = new FilmeDao();		
		filmeDao.conectar();
		
		Filme u = filmeDao.select(10);
		
		u.setTitulo("André");
		u.setClassificacao("Livre");
		
		filmeDao.update(u);		
		filmeDao.desconectar();
			
		System.out.println("Update Filme com Sucesso!");		
	}*/
	
	@Test
	public void testFilmeDaoDelete(){
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.conectar();
		
		Filme u = filmeDao.select(9);
		
		filmeDao.delete(u);		
		filmeDao.desconectar();
		System.out.println("Filme Deletado com Sucesso!");
	}
	
	
}
