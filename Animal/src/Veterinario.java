
public class Veterinario {

	private String nome;
	private String endereco;
	private String telefone;
	private String numeroConselho;
	
	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Veterinario(String nome, String endereco, String telefone, String numeroConselho) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.numeroConselho = numeroConselho;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNumeroConselho() {
		return numeroConselho;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setNumeroConselho(String numeroConselho) {
		this.numeroConselho = numeroConselho;
	}
	
	public boolean efetuar_consulta() {
		return true;
	}
	
	public void efetuar_tratamento() {}
	
}
