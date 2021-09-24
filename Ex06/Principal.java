import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(new Funcionario (
				123,
				"Funcion�rio Silva",
				"Rua X 500 Apto 201",
				'M',
				(float) 3000)
		);
		funcionarios.add(new Funcionario (
				254,
				"Funcion�rio Smith",
				"Rua Y 300",
				'M',
				(float) 3000)
		);
		funcionarios.add(new Funcionario (
				621, 
				"Funcion�rio Jonh", 
				"Rua Alfa 1100", 
				'M', 
				(float) 7000)
		);
		funcionarios.add(new Funcionario (
				297, 
				"Funcion�ria Mel", 
				"Rua Beta 003 Bloco B", 
				'F', 
				(float) 5240.37)
		);
		
		Empresa empresa = new Empresa (
				1, 
				"Empresa Prime",
				"Rua A 235",
				funcionarios
		);
		
		System.out.println(empresa.toString());

	}

}
