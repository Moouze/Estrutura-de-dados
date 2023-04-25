package collectionQueue_Stack;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class exQueue1 {

	public static void main(String[] args) {
		
		int op;
		String newClient;
		
		Scanner leia = new Scanner(System.in);
		Queue<String> client = new LinkedList<String>();
		
		do {
		
		System.out.println("\n---Menu do banco---");
		System.out.println("\n1 - Adicionar Cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar cliente da fila");
		System.out.println("0 - Sair");
		
		System.out.println("\nDigite uma opção");
		op = leia.nextInt();
		
		
		
		switch(op) {
		case 1:
			System.out.println("\nAdicionar novo cliente a fila: ");
			System.out.println("\nDigite o nome do cliente: ");
			newClient = leia.next();
			client.add(newClient);
			System.out.println("\nCliente "+newClient+" adicionado(a) a fila");
			break;
			
		case 2:
			System.out.println("\nListar todos os clientes");
			System.out.println("\nClientes na fila "+client);
			break;
			
		case 3:
			System.out.println("\nRetirar cliente da fila");
			System.out.println("\nCliente "+client.poll()+ " foi chamado(a) ");
			break;
		default:
			System.out.println("\nOpção inválida, tente novamente!!!");
			
			
			
			}
		
		}while(op != 0);
		System.out.println("\nEncerrando aplicação, muito obrigado.");

	}

}
