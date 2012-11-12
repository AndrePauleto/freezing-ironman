package model;

public class Genero {
	private boolean acao;
	private boolean animacao;
	private boolean aventura;
	private boolean comedia;
	private boolean documentarios;
	private boolean drama;
	private boolean erotico;
	private boolean fantasia;
	private boolean ficcaoCientifica;
	private boolean series;
	private boolean guerra;
	private boolean musical;
	private boolean policial;
	private boolean romance;
	private boolean suspense;
	private boolean terror;
	private int id;

	public Genero(int id, boolean acao, boolean animacao, boolean aventura,
			boolean comedia, boolean documentarios, boolean drama,
			boolean erotico, boolean fantasia, boolean ficcaoCientifica,
			boolean series, boolean guerra, boolean musical, boolean policial,
			boolean romance, boolean suspense, boolean terror) {
		super();
		setAcao(acao);
		setAnimacao(animacao);
		setAventura(aventura);
		setComedia(comedia);
		setDocumentarios(documentarios);
		setDrama(drama);
		setErotico(erotico);
		setFantasia(fantasia);
		setficcaoCientifica(ficcaoCientifica);
		setSeries(series);
		setGuerra(guerra);
		setMusical(musical);
		setPolicial(policial);
		setRomance(romance);
		setSuspense(suspense);
		setTerror(terror);
		setId(id);
	}

	public boolean isAcao() {
		return acao;
	}

	public void setAcao(boolean acao) {
		this.acao = acao;
	}

	public boolean isAnimacao() {
		return animacao;
	}

	public void setAnimacao(boolean animacao) {
		this.animacao = animacao;
	}

	public boolean isAventura() {
		return aventura;
	}

	public void setAventura(boolean aventura) {
		this.aventura = aventura;
	}

	public boolean isComedia() {
		return comedia;
	}

	public void setComedia(boolean comedia) {
		this.comedia = comedia;
	}

	public boolean isDocumentarios() {
		return documentarios;
	}

	public void setDocumentarios(boolean documentarios) {
		this.documentarios = documentarios;
	}

	public boolean isDrama() {
		return drama;
	}

	public void setDrama(boolean drama) {
		this.drama = drama;
	}

	public boolean isErotico() {
		return erotico;
	}

	public void setErotico(boolean erotico) {
		this.erotico = erotico;
	}

	public boolean isFantasia() {
		return fantasia;
	}

	public void setFantasia(boolean fantasia) {
		this.fantasia = fantasia;
	}

	public boolean isficcaoCientifica() {
		return ficcaoCientifica;
	}

	public void setficcaoCientifica(boolean ficcaoCientifica) {
		this.ficcaoCientifica = ficcaoCientifica;
	}

	public boolean isSeries() {
		return series;
	}

	public void setSeries(boolean series) {
		this.series = series;
	}

	public boolean isGuerra() {
		return guerra;
	}

	public void setGuerra(boolean guerra) {
		this.guerra = guerra;
	}

	public boolean isMusical() {
		return musical;
	}

	public void setMusical(boolean musical) {
		this.musical = musical;
	}

	public boolean isPolicial() {
		return policial;
	}

	public void setPolicial(boolean policial) {
		this.policial = policial;
	}

	public boolean isRomance() {
		return romance;
	}

	public void setRomance(boolean romance) {
		this.romance = romance;
	}

	public boolean isSuspense() {
		return suspense;
	}

	public void setSuspense(boolean suspense) {
		this.suspense = suspense;
	}

	public boolean isTerror() {
		return terror;
	}

	public void setTerror(boolean terror) {
		this.terror = terror;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Genero [acao=" + acao + ", animacao=" + animacao
				+ ", aventura=" + aventura + ", comedia=" + comedia
				+ ", documentarios=" + documentarios + ", drama=" + drama
				+ ", erotico=" + erotico + ", fantasia=" + fantasia
				+ ", ficcaoCientifica=" + ficcaoCientifica + ", series="
				+ series + ", guerra=" + guerra + ", musical=" + musical
				+ ", policial=" + policial + ", romance=" + romance
				+ ", suspense=" + suspense + ", terror=" + terror + "]";
	}

}
