package model;

public  sealed abstract class Submissao permits Artigo,Palestra,MiniCurso{
	protected String titulo;
	protected int situacao;
	
	protected Autor autor;
	protected Area area;
	protected static int total;
	protected final static int APROVADO = 0;
	protected final static int REJEITADO = 1;
	protected final static int ALTERACOES = 3;
	

	Submissao() {
		this.incrementarTotal();

	};

	Submissao(String titulo, int situacao, Autor autor,Area area) {
		
		this.titulo = titulo;
		this.situacao = situacao;
		this.autor = autor;
		this.area = area;
		this.total = total++;
	
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public static int getAprovado() {
		return APROVADO;
	}

	public static int getRejeitado() {
		return REJEITADO;
	}

	public static int getAlteracoes() {
		return ALTERACOES;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAPROVADO() {
		return APROVADO;
	}

	public int getREJEITADO() {
		return REJEITADO;
	}

	public int getALTERACOES() {
		return ALTERACOES;
	}

	public String avaliar(int situacao) {
		return Integer.toString(situacao);

	}

	public String Avaliar(int situacao) {
		String retorno = " ";
		if (situacao == APROVADO) {
			return "Aprovado";

		} else if (situacao == REJEITADO) {
			return "Reprovado";

		} else {
			return "ALTERAÇÕES";

		}

	}

	private static void incrementarTotal() {
		total++;
	}
}
