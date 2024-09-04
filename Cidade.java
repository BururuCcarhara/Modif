package Modificadores;

public class Cidade {
	private String nome;
	private String estado;
	
	
	public void estad (String nome, String sigla) {
		estado= new Estado();
		Estado.setNome(nome);
		Estado.setSigla(sigla);
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado=estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public String getEsatdo() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado=estado;
}
}