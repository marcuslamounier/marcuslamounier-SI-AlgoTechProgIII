import java.util.ArrayList;

public class Empresa{
	
	private int codigoEmpresa;
	private String nome;
	private String endereco;
	private ArrayList<Funcionario> funcionarios;
	
	public Empresa() {
		super();
	}
	
	public Empresa(int codigoEmpresa, String nome, String endereco, ArrayList<Funcionario> funcionarios) {
		super();
		this.codigoEmpresa = codigoEmpresa;
		this.nome = nome;
		this.endereco = endereco;
		this.funcionarios = funcionarios;
	}
	
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
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
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public String toString() {
		
		String printarDados = "Empresa [codigoEmpresa=" + codigoEmpresa + ", nome=" + nome + ", endereco=" + endereco + ", funcionarios=[";

		for (Funcionario funcionario : getFuncionarios()) {
			printarDados = printarDados.concat(funcionario.toString());
		}
		
		printarDados = printarDados.concat("]]");
		
		return (printarDados);
	}
	
	
}
