package Modificadores;

public class AnimalProtegidos {
	String nome;
	String cor;
	String tamanho;
	String peso;
	String raca;

	protected String getNome() {
	    return nome;
	}
	protected void setNome(String nome) {
	    this.nome = nome;
	}
	protected String getCor() {
	    return cor;
	}
	protected void setCor(String cor) {
	    this.cor = cor;
	}
	protected String getTamanho() {
	    return tamanho;
	}
	protected void setTamanho(String tamanho) {
	    this.tamanho = tamanho;
	}
	protected String getPeso() {
	    return peso;
	}
	protected void setPeso(String peso) {
	    this.peso = peso;
	}
	protected String getRaca() {
	    return raca;
	}
	protected void setRaca(String raca) {
	    this.raca = raca;
	}
}
