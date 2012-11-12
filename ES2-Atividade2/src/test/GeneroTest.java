package test;

import model.Genero;

import org.junit.Test;

import dao.GeneroDao;

public class GeneroTest {

	/*@Test
	public void testGeneroDaoInsert() {
		GeneroDao generoDao = new GeneroDao();
		generoDao.conectar();
		
		Genero u = new Genero(0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true);	
		
		generoDao.insert(u);
		u.toString();
		generoDao.desconectar();
		System.out.println("Genero cadastrado com Sucesso!");
	}*/
	
	/*@Test
	public void testeGeneroDaoSelect(){
		GeneroDao generoDao = new GeneroDao();
		generoDao.conectar();		
		
		System.out.println(generoDao.select());
		
		generoDao.desconectar();
		System.out.println("Select Genero com Sucesso");
	}*/
	
	/*@Test
	public void testeGeneroDaoSelectId(){
		GeneroDao generoDao = new GeneroDao();
		generoDao.conectar();		
		
		System.out.println(generoDao.select(2));
		
		generoDao.desconectar();
		System.out.println("Select Genero com Sucesso");
	}*/
	
	/*@Test
	public void testeGeneroDaoUpdate(){
		GeneroDao generoDao = new GeneroDao();
		generoDao.conectar();
		
		Genero u = generoDao.select(1);
		
		u.setGuerra(true);
		u.setComedia(false);
		
		generoDao.update(u);

		generoDao.desconectar();
		System.out.println("Update Genero com Sucesso");
	}*/
	
	@Test
	public void testeGeneroDaoDelete(){
		GeneroDao generoDao = new GeneroDao();
		generoDao.conectar();		
		generoDao.select();
		
		Genero u = generoDao.select(2);
		generoDao.delete(u);
		System.out.println("Delete Genero com Sucesso!");
	}
	

}
