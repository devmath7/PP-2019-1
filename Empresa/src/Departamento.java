import java.util.ArrayList;

public class Departamento {
	private String codigo;
	private String nome;
	private ArrayList<Funcionario> funcionarios;
	
	public Departamento() {
		
	}
	public Departamento(String codigo, String nome) { 
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFuncionarios() {
		String f=" ";
		for(int i=0;i< this.funcionarios.size();i++) {
			f+=this.funcionarios.get(i).getNome()+" - "+ this.funcionarios.get(i).getMatricula() + "\n";
		}
		return f;
	}
	/*public void setFuncionarios(int i) {
		//a fazer
	}*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void lotarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	 
	public void removerFuncionario(int i) {
		funcionarios.remove(i);
	}
}
