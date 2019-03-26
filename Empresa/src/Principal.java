
public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("11111","filha da tormenta","Targaryen");
		Departamento departamento = new Departamento("1234a","Targaryen");
		departamento.lotarFuncionario(funcionario);
		System.out.println(departamento.getFuncionarios());
	}

}
