package Exemplo;

import java.util.ArrayList;

public class Pesquisador {
	private String nome;
	private int matricula;
	private ArrayList<Projeto> projetos;
	private int qtdMinProjetos;
	
	public Pesquisador(String nome, int matricula) {
		this.nome=nome;
		this.matricula=matricula;
		this.projetos = new ArrayList<Projeto>();
		qtdMinProjetos = 1;
	}
	
	public ArrayList<Projeto> getProjeto(){
		return projetos;
	}
	
	public void alocarEmProjeto(Projeto p) {
		projetos.add(p);
	}
	
	public void desalocarDeProjeto(Projeto p) {
		if (projetos.size() > qtdMinProjetos) {
			projetos.remove(p);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
	}

	public int getQtdMinProjetos() {
		return qtdMinProjetos;
	}

	public void setQtdMinProjetos(int qtdMinProjetos) {
		this.qtdMinProjetos = qtdMinProjetos;
	}
	
	

}
