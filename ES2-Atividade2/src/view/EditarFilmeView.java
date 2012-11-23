package view;

import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Filme;
import model.Genero;
import dao.FilmeDao;
import dao.GeneroDao;

public class EditarFilmeView extends JFrame {

	private static final long serialVersionUID = 1L;
	String[][] dados;

	String[] colunas = new String[] { "id", "titulo", "elenco", "duracao",
			"classificacao", "distribuidor", "sinopse", "genero" };

	DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
	JTable jtable = new JTable(modelo);

	JButton btnEditar;
	JButton btnDeletar;
	private JComboBox cmbxGenero;

	public EditarFilmeView() {
		btnEditar = new JButton("Cadastrar");
		btnDeletar = new JButton("Cancelar");

		adicionaLinha();
		add(jtable);
	}

	public void adicionaLinha() {

		// Obtem o modelo da JTable
		DefaultTableModel modelo = (DefaultTableModel) jtable.getModel();
		preencherComboBox();
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.conectar();
		Collection<Filme> filmeCol = filmeDao.select();

		for (Filme filme : filmeCol) {
			modelo.addRow(new String[] { "'" + filme.getId() + "'",
					"'" + filme.getTitulo() + "'",
					"'" + filme.getElenco() + "'",
					"'" + filme.getDuracao() + "'",
					"'" + filme.getClassificacao() + "'",
					"'" + filme.getDistribuidor() + "'",
					"'" + filme.getSinopse() + "'",
					"'" + filme.getGenero().getId() + "'" });
		}

		filmeDao.desconectar();

	}

	// FIXME: Preencher Genero para colocar na tabela..
	public void preencherComboBox() {
		// ---------- Instancia Combo e preenche com valores do Banco

		GeneroDao generoDao = new GeneroDao();
		generoDao.conectar();
		Collection<Genero> c = generoDao.select();

		cmbxGenero = new JComboBox();

		for (Genero genero : c) {
			Genero r = genero;
			cmbxGenero.addItem(r.getId());
		}

		generoDao.desconectar();
	}

}
