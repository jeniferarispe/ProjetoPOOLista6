package model;

import java.util.Date;

public final class Palestra extends Submissao{

	private String descricao;
	private static int numeroPalestra;
	private Date data;
	private Date hora;
	public Palestra() {
		
		super();
		this.implementarPalestra();
		
	}

	public Palestra(String titulo,int situacao,Autor autor,Area area,String descricao,Date data,Date hora) {
		super(titulo,situacao,autor,area);
		this.descricao=descricao;
		this.data=data;
		this.hora=hora;
		
		this.implementarPalestra();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}
	private static void implementarPalestra() {
		numeroPalestra++;
	}

}
