package model;

import interfaces.Taxa;
import interfaces.TaxaPublicacao;
public final  class Artigo extends Submissao implements TaxaPublicacao{
	private String resumo;
	private static int numeroArtigos;
	private boolean pagTaxa;
	public Artigo() {
		
		super();
		implementarNumeroArtigo();
		
	}

	public Artigo(String titulo, int situacao, Autor autor, Area area, String resumo) {
		super(titulo, situacao, autor, area);
		this.resumo = resumo;
	   implementarNumeroArtigo();
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
private static void implementarNumeroArtigo() {
	numeroArtigos++;
}

@Override
public float getTaxaSubmissao() {
	aplicarTaxa();
	return 25.00f;
}

@Override
public boolean aplicarTaxa() {
	return pagTaxa=true;
	
}








}
