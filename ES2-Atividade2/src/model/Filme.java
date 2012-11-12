package model;


public class Filme {

	private String titulo;
	private String elenco;
	private String direcao;
	private String duracao;
	private String classificacao;
	private String distribuidor;
	private String sinopse;
	private int id;
	private Genero genero;
	

	public Filme(int id, String titulo, Genero genero, String elenco, String direcao,
			String duracao, String classificacao, String distribuidor,
			String sinopse) {
		super();
		setTitulo(titulo);		
		setDirecao(direcao);
		setDuracao(duracao);
		setClassificacao(classificacao);
		setDistribuidor(distribuidor);
		setSinopse(sinopse);
		setElenco(elenco);
		setId(id);
		setGenero(genero);		
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", elenco=" + elenco + ", direcao="
				+ direcao + ", duracao=" + duracao + ", classificacao="
				+ classificacao + ", distribuidor=" + distribuidor
				+ ", sinopse=" + sinopse + ", id=" + id + ", genero=" + genero
				+ "]";
	}		
	
}
