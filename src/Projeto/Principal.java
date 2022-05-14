package Projeto;

import java.util.ArrayList;


public class Principal {
	
	
	static void incluirAluno(ArrayList<Aluno> lista, String nome, String email, String cpf, String endereco) {
		
		if(lista.size() == 0) {
			Aluno aluno = new Aluno(1, nome, email, cpf, endereco);
			lista.add(aluno);
		}
		else {
			int n = lista.get(lista.size() -1).getId();
			Aluno aluno = new Aluno(n + 1, nome, email, cpf, endereco);
			lista.add(aluno);
		}
		
	}
	
	static void exibirAlunos(ArrayList<Aluno> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("ID: " + lista.get(i).getId());
			System.out.println("Nome: " + lista.get(i).getNome());
			System.out.println("Email: " + lista.get(i).getEmail());
			System.out.println("CPF: " + lista.get(i).getcpf());
			System.out.println("Endereço: " + lista.get(i).getEndereco());
			System.out.println("");			
		} 
	}
	
	static void exibirAlunoId(ArrayList<Aluno> lista, int id) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				System.out.println("ID: " + lista.get(i).getId());
				System.out.println("Nome: " + lista.get(i).getNome());
				System.out.println("Email: " + lista.get(i).getEmail());
				System.out.println("CPF: " + lista.get(i).getcpf());
				System.out.println("Endereço: " + lista.get(i).getEndereco());
				System.out.println("");
				
				return;
			}		
		}
		System.out.println("Não existe aluno para este id.");
	}
	
	static void alterarNomeAluno(ArrayList<Aluno> lista, int id, String novoNome) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				lista.get(i).setNome(novoNome);
				return;
			}		
		}
		System.out.println("Não existe aluno para este id.");
	}
	
	static void alterarEmailAluno(ArrayList<Aluno> lista, int id, String novoEmail) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				lista.get(i).setEmail(novoEmail);
				return;
			}		
		}
		System.out.println("Não existe aluno para este id.");
	}
	
	static void alterarEnderecoAluno(ArrayList<Aluno> lista, int id, String novoEndereco) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				lista.get(i).setEndereco(novoEndereco);
				return;
			}			
		}
		System.out.println("Não existe aluno para este id.");
	}
	
	static void removerAluno(ArrayList<Aluno> lista, int id) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				lista.remove(i);
				return;
			}			
		}
		System.out.println("Não existe aluno para este id.");
	}
	
	
	public static void main(String[] args) {
		ArrayList<Aluno> lista = new ArrayList<>();

		/*Exemplo Inclusão de Aluno*/
		incluirAluno(lista,"Lucas Varela", "lucas.vrl@hotmail.com", "12345678910", "Rua 123");
		incluirAluno(lista,"João", "joao@hotmail.com", "45678912310", "Rua 456");
		incluirAluno(lista,"Pedro", "pedro@hotmail.com", "11122233344", "Rua abc");
		
		/*Exibir todos os aluno*/
		exibirAlunos(lista);
		
		/*Exibir Aluno Pelo id. Exemplo id = 2*/
		exibirAlunoId(lista, 3);
		
		/*Alterar Aluno - Alterar Nome, Email e/ou Endereço*/
		alterarNomeAluno(lista, 3, "Fernando");
		alterarEmailAluno(lista, 3, "fernando@hotmail.com");
		alterarEnderecoAluno(lista, 3, "Rua do Fernando");
		
		/*Exibir aluno para conferir alteração*/
		exibirAlunoId(lista, 3);
		
		/*Remover aluno da lista*/
		removerAluno(lista, 1);
		
		/*Exibir alunos para conferir remoção*/
		exibirAlunos(lista);
		
		
	}
}
