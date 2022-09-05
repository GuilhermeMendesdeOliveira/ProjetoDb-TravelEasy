package application;

import java.util.Scanner;

import model.dao.ClienteDao;
import model.dao.DaoFactory;
import model.dao.ViagemDao;
import model.entities.Cliente;
import model.entities.Viagem;

public abstract class Program implements ClienteDao{

	public static void main(String[] args) {
		
		
		ClienteDao clienteDao = DaoFactory.createClienteDao();
		ViagemDao viagemDao = DaoFactory.createViagemDao();
		Viagem viagem = new Viagem();
		Cliente cliente = new Cliente();
		Scanner sc = new Scanner(System.in);
		int test = 0;
		while(test != 2) {	
			System.out.println("Escolha uma opção!");
			System.out.println("1 - INSERIR \n2 - ATUALIZAR \n3 - DELETAR \n4 - PESQUISAR \n5 - LISTA DE CLIENTES");
			int resp = sc.nextInt();
			switch (resp) {
			case 1:
				Cliente.inserirCliente(clienteDao);
				continue;
			case 2:
				Cliente.atualizarCliente(cliente, clienteDao);
				continue;
			case 3:
				System.out.print("Digite o ID do cliente:");
				int id = sc.nextInt();
				cliente.deletarClientePorId(id, clienteDao);
				continue;
			case 4:
				System.out.print("Digite o ID do cliente:");
				id = sc.nextInt();
				cliente.procurarClientePorId(id, cliente, clienteDao);
				continue;
			case 5:
				cliente.mostrarTodosClientes(cliente, clienteDao);
				System.out.println("Deseja continuar?\n1 - SIM \n2 - NAO");
				sc.nextLine();
				test = sc.nextInt();
				if(test == 2) {
					break;
				}
			}
		}
		int teste = 0;
		while(teste != 2) {	
			System.out.println("Escolha uma opção!");
			System.out.println("1 - INSERIR \n2 - ATUALIZAR \n3 - DELETAR \n4 - PESQUISAR \n5 - LISTA DE CLIENTES");
			int resp = sc.nextInt();
			switch (resp) {
			case 1:
				viagem.inserirViagem(viagemDao);
				continue;
			case 2:
				viagem.atualizarViagem(viagem, viagemDao);
				continue;
			case 3:
				System.out.print("Digite o ID da viagem:");
				int id = sc.nextInt();
				viagem.deletarViagemPorId(id, viagemDao);
				continue;
			case 4:
				System.out.print("Digite o ID da viagem:");
				id = sc.nextInt();
				viagem.procurarViagemPorId(id, viagem, viagemDao);
				continue;
			case 5:
				viagem.mostrarTodasViagens(viagemDao);
				System.out.println("Deseja continuar?\n1 - SIM \n2 - NAO");
				sc.nextLine();
				test = sc.nextInt();
				if(teste == 2) {
					break;
				}
			}
		}
		System.out.println("Programa encerrando!");
		sc.close();
		
		
		
	}
		
	
			
			
}
		