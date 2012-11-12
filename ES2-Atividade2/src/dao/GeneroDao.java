package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;

import model.Genero;

public class GeneroDao extends DAO<model.Genero> {
	
	int ultimoId;

	public GeneroDao() {
		super();
        INSERT = "INSERT INTO genero(acao, animacao, aventura, comedia, documentarios, drama, erotico, fantasia, \"ficcaoCientifica\", series, guerra, musical, policial, romance, suspense, terror) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        SELECT = "SELECT * FROM genero";
        SELECT_ID = "SELECT * FROM genero WHERE id_genero = ?";
        UPDATE = "UPDATE genero SET acao = ?, animacao = ?, aventura = ?, comedia = ?, documentarios = ?, drama = ?, erotico = ?, fantasia = ?, \"ficcaoCientifica\" = ?, series = ?, guerra = ?, musical = ?, policial = ?, romance = ?, suspense = ?, terror = ? WHERE id_genero = ?";
        DELETE = "DELETE FROM genero  WHERE id_genero = ?";
	}
	
	@Override
	public boolean insert(Genero u) {
		try {
			ResultSet rs;
			PS_INSERT.setBoolean(1, u.isAcao());
			PS_INSERT.setBoolean(2, u.isAnimacao());
			PS_INSERT.setBoolean(3, u.isAventura());
			PS_INSERT.setBoolean(4, u.isComedia());
			PS_INSERT.setBoolean(5, u.isDocumentarios());
			PS_INSERT.setBoolean(6, u.isDrama());
			PS_INSERT.setBoolean(7, u.isErotico());
			PS_INSERT.setBoolean(8, u.isFantasia());
			PS_INSERT.setBoolean(9, u.isficcaoCientifica());
			PS_INSERT.setBoolean(10, u.isSeries());
			PS_INSERT.setBoolean(11, u.isGuerra());
			PS_INSERT.setBoolean(12, u.isMusical());
			PS_INSERT.setBoolean(13, u.isPolicial());
			PS_INSERT.setBoolean(14, u.isRomance());
			PS_INSERT.setBoolean(15, u.isSuspense());
			PS_INSERT.setBoolean(16, u.isTerror());
			PS_INSERT.executeUpdate();
			
			rs = PS_INSERT.getGeneratedKeys();
			while (rs.next()) {
					ultimoId = rs.getInt(1);
            } 
            rs.close();
			
			PS_INSERT.clearParameters();			
		} catch (SQLException e) {
            throw new RuntimeException("Erro no INSERT Genero Erro! "
                    + e.getMessage());
		}
		return false;
	}

	@Override
	public boolean update(Genero u) {
		try{
			PS_UPDATE.setBoolean(1, u.isAcao());
			PS_UPDATE.setBoolean(2, u.isAnimacao());
			PS_UPDATE.setBoolean(3, u.isAventura());
			PS_UPDATE.setBoolean(4, u.isComedia());
			PS_UPDATE.setBoolean(5, u.isDocumentarios());
			PS_UPDATE.setBoolean(6, u.isDrama());
			PS_UPDATE.setBoolean(7, u.isErotico());
			PS_UPDATE.setBoolean(8, u.isFantasia());
			PS_UPDATE.setBoolean(9, u.isficcaoCientifica());
			PS_UPDATE.setBoolean(10, u.isSeries());
			PS_UPDATE.setBoolean(11, u.isGuerra());
			PS_UPDATE.setBoolean(12, u.isMusical());
			PS_UPDATE.setBoolean(13, u.isPolicial());
			PS_UPDATE.setBoolean(14, u.isRomance());
			PS_UPDATE.setBoolean(15, u.isSuspense());
			PS_UPDATE.setBoolean(16, u.isTerror());
			PS_UPDATE.setInt(17, u.getId());		   		
    		PS_UPDATE.executeUpdate();
    		PS_UPDATE.clearParameters();
        } catch (SQLException e) {
            throw new RuntimeException("Erro no UPDATE Genero Erro! "
                    + e.getMessage());
    	}
    	return true;
	}

	@Override
	public Collection<Genero> select() {
        Collection<Genero> genero = new HashSet<Genero>();
         ResultSet rs;
    	
    	try{
    		rs = PS_SELECT.executeQuery();
    		while (rs.next()) {      			
    			genero.add(new Genero(rs.getInt("id_genero"), rs.getBoolean("acao"), rs.getBoolean("animacao"), rs.getBoolean("aventura"), rs.getBoolean("comedia") , rs.getBoolean("documentarios"), rs.getBoolean("drama"), rs.getBoolean("erotico"), rs.getBoolean("fantasia"), rs.getBoolean("ficcaoCientifica") , rs.getBoolean("series"), rs.getBoolean("guerra"), rs.getBoolean("musical"), rs.getBoolean("policial"), rs.getBoolean("romance"), rs.getBoolean("suspense"), rs.getBoolean("terror")));
    					
            }
    		rs.close();
    	}catch (SQLException e) {
            throw new RuntimeException("Erro no SELECT Genero Erro! "
                    + e.getMessage());
        }
    	
        return genero;
	}

	@Override
	public boolean delete(Genero u) {
    	try{
    		PS_DELETE.setInt(1, u.getId());
    		PS_DELETE.executeUpdate();
    		PS_DELETE.clearParameters();
    	}catch (SQLException e) {
            throw new RuntimeException("Erro no DELETE Genero Erro! "
                    + e.getMessage());
    	}
    	return true;  
	}

	@Override
	public Genero select(int id) {
		Genero genero = null;
		ResultSet rs;

        try {
            PS_SELECT_ID.setInt(1, id);
            rs = PS_SELECT_ID.executeQuery();
            rs.next();
            genero = new Genero(rs.getInt("id_genero"), rs.getBoolean("acao"), rs.getBoolean("animacao"), rs.getBoolean("aventura"), rs.getBoolean("comedia") , rs.getBoolean("documentarios"), rs.getBoolean("drama"), rs.getBoolean("erotico"), rs.getBoolean("fantasia"), rs.getBoolean("ficcaoCientifica") , rs.getBoolean("series"), rs.getBoolean("guerra"), rs.getBoolean("musical"), rs.getBoolean("policial"), rs.getBoolean("romance"), rs.getBoolean("suspense"), rs.getBoolean("terror"));                        
        } catch (SQLException e) {
            throw new RuntimeException("Erro no SELECT_ID Genero Erro! "
                    + e.getMessage());
        }

        return genero;
	}

	public int getUltimoId() {
		return ultimoId;
	}
}
