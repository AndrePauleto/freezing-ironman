package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import model.Filme;
import model.Genero;
import dao.FilmeDao;
import dao.GeneroDao;

public class CadastrarFilmeView extends JFrame implements ItemListener{

	//Campos referente ao genero
	private static final long serialVersionUID = 1L;
	private JLabel lblAcao;
	private JCheckBox cbxAcao;
	private JLabel lblAnimacao;
	private JCheckBox cbxAnimacao;
	private JLabel lblAventura;
	private JCheckBox cbxAventura;
	private JLabel lblComedia;
	private JCheckBox cbxComedia;
	private JLabel lblDocumentarios;
	private JCheckBox cbxDocumentarios;
	private JLabel lblDrama;
	private JCheckBox cbxDrama;
	private JLabel lblErotico;
	private JCheckBox cbxErotico;
	private JLabel lblFantasia;
	private JCheckBox cbxFantasia;
	private JLabel lblFiccaoCientifica;
	private JCheckBox cbxFiccaoCientifica;
	private JLabel lblSeries;
	private JCheckBox cbxSeries;
	private JLabel lblGuerra;
	private JCheckBox cbxGuerra;
	private JLabel lblMusical;
	private JCheckBox cbxMusical;
	private JLabel lblPolicial;
	private JCheckBox cbxPolicial;
	private JLabel lblRomance;
	private JCheckBox cbxRomance;
	private JLabel lblSuspense;
	private JCheckBox cbxSuspense;
	private JLabel lblTerror;
	private JCheckBox cbxTerror;
	
	
	boolean acao = true;
	boolean animacao = true;
	boolean aventura = true;
	boolean comedia = true;
	boolean documentarios = true;
	boolean drama = true;
	boolean erotico = true;
	boolean fantasia = true;
	boolean ficcaoCientifica = true;
	boolean series = true;
	boolean guerra = true;
	boolean musical = true;
	boolean policial = true;
	boolean romance = true;
	boolean suspense = true;
	boolean terror = true;
	
	//Campos referente ao Filme
	private JLabel lblTitulo;
	private JLabel lblDirecao;
	private JLabel lblDuracao;
	private JLabel lblClassificacao;
	private JLabel lblDistribuidor;
	private JLabel lblSinopse;
	private JLabel lblElenco;
	private JTextField txtTitulo;	
	private JTextField txtDirecao;
	private JTextField txtDuracao;
	private JTextField txtClassificacao;
	private JTextField txtDistribuidor;
	private JTextField txtSinopse;
	private JTextField txtElenco;
	
	String titulo;
	String direcao;
	String duracao;
	String classificacao;
	String distribuidor;
	String sinopse;
	String elenco;
	
	private JPanel panel;

	private JButton cadastrar;
	private JButton cancelar;
	
	public CadastrarFilmeView() {
		montaTela();
		acaoBotaoCadastrar();
	}
	
	private void montaTela() {

		setTitle("SysClub - Cadastra Regra");
		
		//---------- Instancia CheckBox ------------
		cbxAcao = new JCheckBox("Ação");
		cbxAcao.setMnemonic(KeyEvent.VK_A);
		cbxAcao.setSelected(true);
		cbxAcao.addItemListener(this);

		cbxAnimacao = new JCheckBox("Animação");
		cbxAnimacao.setMnemonic(KeyEvent.VK_N);
		cbxAnimacao.setSelected(true);
		cbxAnimacao.addItemListener(this);

		cbxAventura = new JCheckBox("Aventura");
		cbxAventura.setMnemonic(KeyEvent.VK_V);
		cbxAventura.setSelected(true);
		cbxAventura.addItemListener(this);

		cbxComedia = new JCheckBox("Comédia");
		cbxComedia.setMnemonic(KeyEvent.VK_C);
		cbxComedia.setSelected(true);
		cbxComedia.addItemListener(this);

		cbxDocumentarios = new JCheckBox("Documentários");
		cbxDocumentarios.setMnemonic(KeyEvent.VK_D);
		cbxDocumentarios.setSelected(true);
		cbxDocumentarios.addItemListener(this);

		cbxDrama = new JCheckBox("Drama");
		cbxDrama.setMnemonic(KeyEvent.VK_R);
		cbxDrama.setSelected(true);
		cbxDrama.addItemListener(this);

		cbxErotico = new JCheckBox("Erótico");
		cbxErotico.setMnemonic(KeyEvent.VK_E);
		cbxErotico.setSelected(true);
		cbxErotico.addItemListener(this);
		
		cbxFantasia = new JCheckBox("Fantasia");
		cbxFantasia.setMnemonic(KeyEvent.VK_F);
		cbxFantasia.setSelected(true);
		cbxFantasia.addItemListener(this);
		
		cbxFiccaoCientifica = new JCheckBox("Ficção Cientifica");
		cbxFiccaoCientifica.setMnemonic(KeyEvent.VK_I);
		cbxFiccaoCientifica.setSelected(true);
		cbxFiccaoCientifica.addItemListener(this);

		cbxSeries = new JCheckBox("Séries");
		cbxSeries.setMnemonic(KeyEvent.VK_S);
		cbxSeries.setSelected(true);
		cbxSeries.addItemListener(this);
		
		cbxGuerra = new JCheckBox("Guerra");
		cbxGuerra.setMnemonic(KeyEvent.VK_G);
		cbxGuerra.setSelected(true);
		cbxGuerra.addItemListener(this);
		
		cbxMusical = new JCheckBox("Musical");
		cbxMusical.setMnemonic(KeyEvent.VK_M);
		cbxMusical.setSelected(true);
		cbxMusical.addItemListener(this);
		
		cbxPolicial = new JCheckBox("Policial");
		cbxPolicial.setMnemonic(KeyEvent.VK_P);
		cbxPolicial.setSelected(true);
		cbxPolicial.addItemListener(this);
		
		cbxRomance = new JCheckBox("Romance");
		cbxRomance.setMnemonic(KeyEvent.VK_R);
		cbxRomance.setSelected(true);
		cbxRomance.addItemListener(this);
		
		cbxSuspense = new JCheckBox("Suspence");
		cbxSuspense.setMnemonic(KeyEvent.VK_S);
		cbxSuspense.setSelected(true);
		cbxSuspense.addItemListener(this);
		
		cbxTerror = new JCheckBox("Terror");
		cbxTerror.setMnemonic(KeyEvent.VK_T);
		cbxTerror.setSelected(true);
		cbxTerror.addItemListener(this);
		
		

		
		//---------- Instancia Label/TextField------------
		lblTitulo = new JLabel();
		lblTitulo.setText("Título");
		txtTitulo = new JTextField(15);
		
		lblDirecao = new JLabel();
		lblDirecao.setText("Direção:");
		txtDirecao = new JTextField(15);
		
		lblDuracao = new JLabel();
		lblDuracao.setText("Duração:");
		txtDuracao = new JTextField(15);
		
		lblClassificacao = new JLabel();
		lblClassificacao.setText("Classificação:");
		txtClassificacao = new JTextField(15);
		
		lblDistribuidor = new JLabel();
		lblDistribuidor.setText("Distribuidor:");
		txtDistribuidor = new JTextField(15);
		
		lblSinopse = new JLabel();
		lblSinopse.setText("Sinopse:");
		txtSinopse = new JTextField(15);
		
		lblElenco = new JLabel();
		lblElenco.setText("Elenco:");
		txtElenco = new JTextField(15);
		
		
		//---------- Instancia Botões ------------
		cadastrar = new JButton("Cadastrar");
		cancelar = new JButton("Cancelar");
		this.getRootPane().setDefaultButton(cadastrar);
		
		
		//------------ Preenche dados nos paineis --------------
		JPanel fundo = new JPanel();		
		
		JPanel checkPanel = new JPanel(new GridLayout(4, 2));
		checkPanel.setBorder(new TitledBorder("Genero"));
		checkPanel.add(cbxAcao);
		checkPanel.add(cbxAnimacao);
		checkPanel.add(cbxAventura);
		checkPanel.add(cbxComedia);
		checkPanel.add(cbxDocumentarios);
		checkPanel.add(cbxDrama);
		checkPanel.add(cbxErotico);
		checkPanel.add(cbxFantasia);
		checkPanel.add(cbxFiccaoCientifica);
		checkPanel.add(cbxSeries);
		checkPanel.add(cbxGuerra);
		checkPanel.add(cbxMusical);
		checkPanel.add(cbxPolicial);
		checkPanel.add(cbxRomance);
		checkPanel.add(cbxSuspense);
		checkPanel.add(cbxTerror);
		
		fundo.add(checkPanel, BorderLayout.WEST);
		
		panel = new JPanel(new GridLayout(7, 2));
		panel.setBorder(new TitledBorder("Filmes"));
		panel.add(lblTitulo);
		panel.add(txtTitulo);
		panel.add(lblDirecao);
		panel.add(txtDirecao);
		panel.add(lblDuracao);
		panel.add(txtDuracao);
		panel.add(lblClassificacao);
		panel.add(txtClassificacao);
		panel.add(lblDistribuidor);
		panel.add(txtDistribuidor);
		panel.add(lblSinopse);
		panel.add(txtSinopse);
		panel.add(lblElenco);
		panel.add(txtElenco);
		
		fundo.add(panel, BorderLayout.EAST);
		fundo.add(cadastrar);
		fundo.add(cancelar);
		add(fundo);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		int index = 0;
		Object source = e.getItemSelectable();
		

		if (source == cbxAcao) {
			index = 0;
			acao = false;
		} else if (source == cbxAnimacao) {
			index = 1;
			animacao = false;
		} else if (source == cbxAventura) {
			index = 2;
			aventura = false;
		} else if (source == cbxComedia) {
			index = 3;
			comedia = false;
		} else if (source == cbxDocumentarios) {
			index = 4;
			documentarios = false;
		} else if (source == cbxDrama) {
			index = 5;
			drama = false;
		} else if (source == cbxErotico) {
			index = 6;
			erotico = false;
		} else if (source == cbxFantasia) {
			index = 7;
			fantasia = false;
		} else if (source == cbxFiccaoCientifica) {
			index = 8;
			ficcaoCientifica = false;
		} else if (source == cbxSeries) {
			index = 9;
			series = false;
		} else if (source == cbxGuerra) {
			index = 10;
			guerra = false;
		} else if (source == cbxMusical) {
			index = 11;
			musical = false;
		} else if (source == cbxPolicial) {
			index = 12;
			policial = false;
		} else if (source == cbxRomance) {
			index = 13;
			romance = false;
		} else if (source == cbxSuspense) {
			index = 14;
			suspense = false;
		} else if (source == cbxTerror) {
			index = 15;
			terror = false;
		}
		
	}

	private void acaoBotaoCadastrar() {

		cadastrar.addActionListener(new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					GeneroDao generoDao = new GeneroDao();
					Genero u = new Genero(1, acao, animacao, aventura, comedia, documentarios, drama, erotico, fantasia, ficcaoCientifica, series, guerra, musical, policial, romance, suspense, terror);
					generoDao.conectar();
					generoDao.insert(u);						
					Genero d = generoDao.select(generoDao.getUltimoId());
					generoDao.desconectar();
					
					getCampos();
					
					
					FilmeDao filmeDao = new FilmeDao();
					 
					Filme r = new Filme(1, titulo, d, elenco, direcao, duracao, classificacao, distribuidor, sinopse);
					filmeDao.conectar();
					filmeDao.insert(r);
					filmeDao.desconectar();					
					
					limpaCampos();
					
					JOptionPane.showMessageDialog(null,
							"Filme cadastrado com Sucesso", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,
							"Não foi possível cadsatrar o Filme", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
	
	private void getCampos() {
		titulo = txtTitulo.getText();
		direcao = txtDirecao.getText();
		duracao = txtDuracao.getText();
		classificacao = txtClassificacao.getText();
		distribuidor = txtDistribuidor.getText();
		sinopse = txtSinopse.getText();
		elenco = txtElenco.getText();
	}
	
	private void limpaCampos() {
		txtTitulo.setText("");
		txtDirecao.setText("");
		txtDuracao.setText("");
		txtClassificacao.setText("");
		txtDistribuidor.setText("");
		txtSinopse.setText("");
		txtElenco.setText("");
	}
	
}
