package Projeto;

//import java.util.ArrayList;

public class Aluno {
	
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private String endereco;

	public Aluno(int id, String nome, String email, String cpf, String endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}


