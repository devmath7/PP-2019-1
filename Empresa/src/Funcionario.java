
public class Funcionario {
	private String matricula;
	private String nome;
	private String departamento;
	
	public Funcionario() {
	}
	
	public Funcionario(String matricula, String nome,String departamento) {
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
