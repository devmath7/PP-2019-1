
public class Animal {
	private String nome;
	private char sexo;
	private int idade;
	private String especie;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String nome, char sexo, int idade, String especie) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public boolean iniciar_tratamento() {
		return true;
	}
	
	public boolean finalizar_tratamento() {
		return false;
	}
}
