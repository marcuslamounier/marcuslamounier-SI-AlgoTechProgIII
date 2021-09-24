public class Funcionario{

	private int numRegistro;
	private String nome;
	private String endereco;
	private char sexo;
	private float salario;

	public Funcionario() {
		super();
	}

	public Funcionario(int numRegistro, String nome, String endereco, char sexo, float salario) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.salario = salario;
	}

	public boolean aumentarSalario( float aumento ){
		
		if ( aumento > ((this.salario * 20) / 100) ){
			System.out.println("O aumento é superior a 20% do salário atual. NÃO AUTORIZADO");
			return false;
		} else {
			this.salario += aumento;
			return true;
		}		
	}

	public boolean reduzirSalario( float reducao ){
		
		if ( reducao > ((this.salario * 20) / 100) ){
			System.out.println("A redução é superior a 20% do salário atual. NÃO AUTORIZADO");
			return false;
		} else {
			this.salario -= reducao;
			return true;
		}		
	}

	public void aumentarSalario(){
		this.salario += ((this.salario * 10) / 100);
	}
	public void reduzirSalario(){
		this.salario -= ((this.salario * 10) / 100);
	}	
	public int getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nFuncionario [numRegistro=" + numRegistro + ", nome=" + nome + ", endereco=" + endereco + ", sexo="
				+ sexo + ", salario=" + salario + "]";
	}
	
}