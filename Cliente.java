import java.util.ArrayList;
import java.util.List;

public class Cliente {
	// Atributos
	int idCliente;
	String nome;
	String dataNasc;
	String cpf;
	int diaDev;
	int filmesLoc;
	List<Locacao> locacoes = new ArrayList<>();

	// Construtor
	public Cliente(int idCliente, String nome, String dataNasc, String cpf, int diaDev) {
		// Atributos
		this.idCliente = idCliente;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.diaDev = diaDev;
		this.filmesLoc = 0;
	}

	// Método com a Quantidade de Filmes locados
	int QtdeFimesLocCliente(int filmesLoc) {
		return this.filmesLoc = filmesLoc;
	}

	// Impressão Dados do CLiente
	public void mostrarCliente() {
		System.out.println("----------------CLIENTE----------------");
		System.out.println("--> Nº ID DO CLIENTE: " + idCliente);
		System.out.println("-> NOME COMPLETO: " + nome);
		System.out.println("-> DATA DE NASCIMENTO: " + dataNasc);
		System.out.println("-> CPF: " + cpf);
		System.out.println("-> DIAS P/ DEVOLUÇÃO: " + diaDev);
		System.out.println("-> QTDE DE LOCAÇÕES: " + filmesLoc);
		System.out.println("----------------------------------------");
	}
	// Adição de Locações
	void adicionarLocacao(Locacao locacao) {
		this.locacoes.add(locacao);
	}

	// Lista de locações
	int locacoes() {
		int qtd = 0;
		for (Locacao locacao : this.locacoes) {
			for (Filme filme : locacao.filmes) {
				qtd++;
			}
		}

		return qtd;
	}
}
