package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;

import model.Filme;

public class FilmeDao extends DAO<model.Filme> {
	public FilmeDao() {
		super();
        INSERT = "INSERT INTO filme(titulo, genero, elenco, direcao, duracao, classificacao, distribuidor, sinopse) VALUES(?,?,?,?,?,?,?,?)";
        SELECT = "SELECT * FROM filme";
        SELECT_ID = "SELECT * FROM filme WHERE id_filme = ?";
        UPDATE = "UPDATE filme SET titulo = ?, genero = ?, elenco = ?, direcao = ?, duracao = ?, classificacao = ?, distribuidor = ?, sinopse = ? WHERE id_filme = ?";
        DELETE = "DELETE FROM filme  WHERE id_socio = ?";
	}
 

	@Override
	public boolean insert(Filme u) {
		try {
			PS_INSERT.setString(1, u.getTitulo());
			PS_INSERT.setString(2, u.getGenero());
			PS_INSERT.setString(3, u.getElenco());
			PS_INSERT.setString(4, u.getDirecao());
			PS_INSERT.setString(5, u.getDuracao());
			PS_INSERT.setString(6, u.getClassificacao());
			PS_INSERT.setString(7, u.getDistribuidor());
			PS_INSERT.setString(8, u.getSinopse());
			PS_INSERT.executeUpdate();
			PS_INSERT.clearParameters();			
		} catch (SQLException e) {
            throw new RuntimeException("Erro no INSERT Sócio Erro! "
                    + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean update(Filme u) {
		try{
			PS_UPDATE.setString(1, u.getTitulo());
			PS_UPDATE.setString(2, u.getGenero());
			PS_UPDATE.setString(3, u.getElenco());
			PS_UPDATE.setString(4, u.getDirecao());
			PS_UPDATE.setString(5, u.getDuracao());
			PS_UPDATE.setString(6, u.getClassificacao());
			PS_UPDATE.setString(7, u.getDistribuidor());
			PS_UPDATE.setString(8, u.getSinopse());
			PS_UPDATE.setInt(9, u.getId());		   		
    		PS_UPDATE.executeUpdate();
    		PS_UPDATE.clearParameters();
        } catch (SQLException e) {
            throw new RuntimeException("Erro no UPDATE Sócio Erro! "
                    + e.getMessage());
    	}
    	return true;
	}

	@Override
	public Collection<Filme> select() {
        Collection<Filme> filme = new HashSet<Filme>();
        ResultSet rs;
    	
    	try{
    		rs = PS_SELECT.executeQuery();
    		while (rs.next()) {      			
    			filme.add(new Filme(rs.getInt("id_filme"), rs.getString("titulo"), rs.getString("genero"), rs.getString("elenco"), rs.getString("direcao"), rs.getString("duracao"), rs.getString("classificacao"), rs.getString("distribuidor"), rs.getString("sinopse")));
    					
            }
    		rs.close();
    	}catch (SQLException e) {
            throw new RuntimeException("Erro no SELECT Cartao Erro! "
                    + e.getMessage());
        }
    	
        return filme;
	}

	@Override
	public boolean delete(Filme u) {
    	try{
    		PS_DELETE.setInt(1, u.getId());
    		PS_DELETE.executeUpdate();
    		PS_DELETE.clearParameters();
    	}catch (SQLException e) {
            throw new RuntimeException("Erro no DELETE Sócio Erro! "
                    + e.getMessage());
    	}
    	return true;  
	}

	@Override
	public Filme select(int id) {
		Filme filme = null;
        ResultSet rs;

        try {
            PS_SELECT_ID.setInt(1, id);
            rs = PS_SELECT_ID.executeQuery();
            rs.next();
            filme = new Filme(rs.getInt("id_filme"), rs.getString("titulo"), rs.getString("genero"), rs.getString("elenco"), rs.getString("direcao"), rs.getString("duracao"), rs.getString("classificacao"), rs.getString("distribuidor"), rs.getString("sinopse"));
                        
        } catch (SQLException e) {
            throw new RuntimeException("Erro no SELECT_ID Cartao Erro! "
                    + e.getMessage());
        }

        return filme;
	}
}
