package model;

import java.util.ArrayList;

public class Filme {

	private String titulo;
	private String genero;
	private String elenco;
	private String direcao;
	private String duracao;
	private String classificacao;
	private String distribuidor;
	private String sinopse;
	private int id;
	
	ArrayList listaElenco = new ArrayList();

	public Filme(int id, String titulo, String genero, String elenco, String direcao,
			String duracao, String classificacao, String distribuidor,
			String sinopse) {
		super();
		setTitulo(titulo);
		setGenero(genero);
		listaElenco.add(classificacao);
		setDirecao(direcao);
		setDuracao(duracao);
		setClassificacao(classificacao);
		setDistribuidor(distribuidor);
		setSinopse(sinopse);
		setId(id);
		
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getElenco() {
		return elenco;
	}


	public void setElenco(String elenco) {
		this.elenco = elenco;
	}


	public String getDirecao() {
		return direcao;
	}


	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}


	public String getDuracao() {
		return duracao;
	}


	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}


	public String getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}


	public String getDistribuidor() {
		return distribuidor;
	}


	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}


	public String getSinopse() {
		return sinopse;
	}


	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	

	public void addListaElenco(String elenco){
		listaElenco.add(elenco);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", genero=" + genero + ", direcao="
				+ direcao + ", duracao=" + duracao + ", classificacao="
				+ classificacao + ", distribuidor=" + distribuidor
				+ ", sinopse=" + sinopse + ", listaElenco=" + listaElenco + "]";
	}

	
	
}
